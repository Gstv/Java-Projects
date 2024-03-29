/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zelda;

import Entities.*;
import Graficos.Spritesheet;
import Graficos.UI;
import World.World;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

/**
 *
 * @author Guilherme Delmondes
 */
public class Game extends Canvas implements Runnable, KeyListener, MouseListener {

    public static JFrame frame;
    private Thread thread;
    private boolean isRunning = true;
    public static final int WIDTH = 240;
    public static final int HEIGHT = 160;
    public static final int SCALE = 3;

    private int CUR_LEVEL = 1, MAX_LEVEL = 2;

    private BufferedImage image;

    public static List<Entity> entities;
    public static List<Enemy> enemies;
    public static List<BulletShoot> bullets;
    public static Spritesheet spritesheet;

    public static World world;

    public static Player player;

    public static Random rand;

    public UI ui;

    public static String gameState = "MENU";
    private boolean showMessageGameOver = true;
    private boolean restartGame = false;
    private int framesGameOver = 0;

    public Menu menu;

    public Game() {
        rand = new Random();
        addKeyListener(this);
        addMouseListener(this);
        setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        initFrame();
        //Inicializa objetos
        ui = new UI();
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        entities = new ArrayList<Entity>();
        enemies = new ArrayList<Enemy>();
        bullets = new ArrayList<BulletShoot>();
        spritesheet = new Spritesheet("/res/spritesheet.png");
        player = new Player(0, 0, 16, 16, spritesheet.getSprite(32, 0, 16, 16));
        entities.add(player);
        world = new World("/res/level1.png");

        menu = new Menu();

    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int frames = 0;
        double timer = System.currentTimeMillis();
        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                tick();
                render();
                frames++;
                delta--;
            }

            if (System.currentTimeMillis() - timer >= 1000) {
                System.out.println("FPS " + frames);
                frames = 0;
                timer += 1000;
            }
        }
        stop();
    }

    public void tick() {
        if (gameState == "NORMAL") {
            this.restartGame = false;
            for (int i = 0; i < entities.size(); i++) {
                Entity e = entities.get(i);
                e.tick();
            }
            for (int i = 0; i < bullets.size(); i++) {
                bullets.get(i).tick();
            }
            if (enemies.size() == 0) {
                //TROCA FASE
                CUR_LEVEL++;
                if (CUR_LEVEL > MAX_LEVEL) {
                    CUR_LEVEL = 1;
                }
                String newWorld = "level" + CUR_LEVEL + ".png";
                World.restartGame(newWorld);
            }
        } else if (gameState == "GAME_OVER") {
            this.framesGameOver++;
            if (this.framesGameOver == 30) {
                this.framesGameOver = 0;
                if (this.showMessageGameOver) {
                    this.showMessageGameOver = false;
                } else {
                    this.showMessageGameOver = true;
                }
            }
            if (restartGame) {
                this.restartGame = false;
                this.gameState = "NORMAL";
                CUR_LEVEL = 1;
                String newWorld = "level" + CUR_LEVEL + ".png";
                World.restartGame(newWorld);
            }
        } else if (gameState == "MENU") {
            menu.tick();
        }
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = image.getGraphics();
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, WIDTH, HEIGHT);

        world.render(g);
        for (int i = 0; i < entities.size(); i++) {
            Entity e = entities.get(i);
            e.render(g);
        }
        for (int i = 0; i < bullets.size(); i++) {
            bullets.get(i).render(g);
        }
        ui.render(g);

        g.dispose();
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
        g.setFont(new Font("Arial", Font.BOLD, 17));
        g.drawString("Ammo = " + player.ammo, 600, 20);
        if (gameState == "GAME_OVER") {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(0, 0, 0, 100));
            g2.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.setColor(Color.white);
            g.drawString("Game Over", (WIDTH / 2) * SCALE - gameState.length() * 10, (HEIGHT / 2) * SCALE);
            if (showMessageGameOver) {
                g.drawString(">Pressione Enter para reiniciar<", (WIDTH / 2) * SCALE - 300, (HEIGHT / 2) * SCALE + 40);
            }
        } else if (gameState == "MENU") {
            menu.render(g);
        }
        bs.show();

    }

    public synchronized void start() {
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public synchronized void stop() {
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void initFrame() {
        frame = new JFrame("Game #1");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Sem uso
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.right = true;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.left = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.up = true;
            if (gameState == "MENU") {
                menu.up = true;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.down = true;
            if (gameState == "MENU") {
                menu.down = true;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            player.shoot = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            this.restartGame = true;
            if(gameState == "MENU"){
                menu.enter = true;
            }
        }
        
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            gameState = "MENU";
            menu.pause = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.right = false;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.left = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.up = false;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.down = false;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        player.mouseShoot = true;
        player.mx = (e.getX() / 3);
        player.my = (e.getY() / 3);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

}
