/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Graficos.Spritesheet;
import World.World;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import zelda.Game;
import static zelda.Game.enemies;
import static zelda.Game.entities;
import static zelda.Game.player;
import static zelda.Game.spritesheet;
import static zelda.Game.world;

/**
 *
 * @author Guilherme Delmondes
 */
public class Player extends Entity {

    public int right_dir = 0, left_dir = 1;
    public int dir = right_dir;
    public boolean right, up, left, down;
    public double speed = 1.4;

    private BufferedImage playerDamage;

    private int frames = 0, maxFrames = 5, index = 0, maxIndex = 3;
    private boolean moved = false;
    private BufferedImage[] rightPlayer;
    private BufferedImage[] leftPlayer;

    public double life = 100, maxLife = 100;
    public int mx, my;

    public boolean isDamaged = false;
    private int damageFrames = 0;
    public boolean shoot = false, mouseShoot = false;

    private boolean gun = false;

    public int ammo = 0;

    public Player(int x, int y, int width, int height, BufferedImage sprite) {
        super(x, y, width, height, sprite);
        rightPlayer = new BufferedImage[4];
        leftPlayer = new BufferedImage[4];
        playerDamage = Game.spritesheet.getSprite(144, 0, 16, 16);
        for (int i = 0; i < 4; i++) {
            rightPlayer[i] = Game.spritesheet.getSprite(32 + (i * 16), 0, 16, 16);
        }
        for (int i = 0; i < 4; i++) {
            leftPlayer[i] = Game.spritesheet.getSprite(32 + (i * 16), 16, 16, 16);
        }

    }

    @Override
    public void tick() {
        moved = false;
        if (right && World.isFree((int) (x + speed), this.getY())) {
            moved = true;
            dir = right_dir;
            this.x += speed;
        } else if (left && World.isFree((int) (x - speed), this.getY())) {
            moved = true;
            dir = left_dir;
            this.x -= speed;
        }
        if (up && World.isFree(this.getX(), (int) (y - speed))) {
            moved = true;
            this.y -= speed;
        } else if (down && World.isFree(this.getX(), (int) (y + speed))) {
            moved = true;
            this.y += speed;
        }
        if (moved) {
            frames++;
            if (frames == maxFrames) {
                frames = 0;
                index++;
                if (index > maxIndex) {
                    index = 0;
                }
            }
        }

        this.collisionLifePack();
        this.collisionBullet();
        this.collisionGun();

        if (isDamaged) {
            this.damageFrames++;
            if (this.damageFrames == 15) {
                this.damageFrames = 0;
                isDamaged = false;
            }
        }

        if (shoot) {
            shoot = false;
            if (gun && ammo > 0) {
                ammo--;

                int dx = 0;
                int px = 0;
                int py = 7;
                if (dir == right_dir) {
                    px = 20;
                    dx = 1;
                } else {
                    px = -10;
                    dx = -1;
                }
                BulletShoot bullet = new BulletShoot(this.getX() + px, this.getY() + py, 3, 3, null, dx, 0);
                Game.bullets.add(bullet);
            }
        }

        if (mouseShoot) {
            mouseShoot = false;
            if (gun && ammo > 0) {
                ammo--;
                double angle = 0;
                int px = 0, py = 8;
                if (dir == right_dir) {
                    px = 20;
                    angle = Math.atan2(my - (this.getY() + py - Camera.y), mx - (this.getX() + px - Camera.x));
                } else {
                    angle = Math.atan2(my - (this.getY() + py - Camera.y), mx - (this.getX() + px - Camera.x));
                    px = -10;

                }
                double dx = Math.cos(angle);
                double dy = Math.sin(angle);

                BulletShoot bullet = new BulletShoot(this.getX() + px, this.getY() + py, 3, 3, null, dx, dy);
                Game.bullets.add(bullet);
            }
        }

        if (life <= 0) {
            life = 0;
            Game.gameState = "GAME_OVER";
        }

        Camera.x = Camera.clamp(this.getX() - (Game.WIDTH / 2), 0, World.WIDTH * 16 - Game.WIDTH);
        Camera.y = Camera.clamp(this.getY() - (Game.HEIGHT / 2), 0, World.HEIGHT * 16 - Game.HEIGHT);
    }

    public void collisionBullet() {
        for (int i = 0; i < Game.entities.size(); i++) {
            Entity atual = Game.entities.get(i);
            if (atual instanceof Bullet) {
                if (Entity.isColliding(this, atual)) {
                    ammo += 50;
                    // System.out.println("AMMO: "+ammo);
                    Game.entities.remove(atual);
                }
            }
        }
    }

    public void collisionGun() {
        for (int i = 0; i < Game.entities.size(); i++) {
            Entity atual = Game.entities.get(i);
            if (atual instanceof Weapon) {
                if (Entity.isColliding(this, atual)) {
                    this.gun = true;
                    Game.entities.remove(atual);
                }
            }
        }
    }

    public void collisionLifePack() {
        for (int i = 0; i < Game.entities.size(); i++) {
            Entity atual = Game.entities.get(i);
            if (atual instanceof Lifepack) {
                if (Entity.isColliding(this, atual)) {
                    life += 10;
                    if (life > 100) {
                        life = 100;
                    }
                    Game.entities.remove(atual);
                }
            }
        }
    }

    @Override
    public void render(Graphics g) {
        if (!isDamaged) {
            if (dir == right_dir) {
                g.drawImage(rightPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
                if (gun) {
                    g.drawImage(Entity.GUN_RIGHT, this.getX() - Camera.x + 9, this.getY() - Camera.y - 1, null);
                }
            } else if (dir == left_dir) {
                g.drawImage(leftPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
                if (gun) {
                    g.drawImage(Entity.GUN_LEFT, this.getX() - Camera.x - 9, this.getY() - Camera.y - 1, null);
                }
            }
        } else {
            g.drawImage(playerDamage, this.getX() - Camera.x, this.getY() - Camera.y, null);
            if (gun && dir == right_dir) {
                g.drawImage(Entity.DGUN_RIGHT, this.getX() - Camera.x + 9, this.getY() - Camera.y - 1, null);
            } else if (gun && dir == left_dir) {
                g.drawImage(Entity.DGUN_LEFT, this.getX() - Camera.x - 9, this.getY() - Camera.y - 1, null);
            }
        }
    }

}
