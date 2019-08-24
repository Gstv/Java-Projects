
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio.aglubacheski
 */
public class Jogo extends JPanel  implements KeyListener{
    private boolean jogoAtivo;
    private Imagem imagem1, imagem2;
    public Jogo(){
        
        JFrame frame = new JFrame("Ola Mundo Grafico");
       
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//desabilita maximizar janela
        frame.setVisible(true);
        frame.add(this); // adiciona o JPanel na janela
        
        this.setBackground( Color.white ); // muda cor de fundo do JPanel
        this.addKeyListener(this); // registra o JPanel na lista de eventos a serem repassados
        setFocusable(true); // permite o JPanel receber o os eventos
        
        jogoAtivo = true;
    }
    /*
    Metodo carrega imagens e faz leitura de arquivos
    */
    public void load(){
        
        // carrega uma imagem
        try {
            // a imagem deve estar na pasta base do projeto
            // para esse projeto seria .\02SwingJPanelEventos
            imagem1 = new Imagem(10, 10, 64, 205, "desenho.bmp");
            imagem2 = new Imagem(10, 250, "smiley.bmp");
        }catch (IOException e) {
            System.out.println("Impossosivel carregar a imagem:"+e);
        }
        
    }
    @Override
    public void paint(Graphics g) {
        // limpa a janela
        super.paint(g);
        imagem1.desenha(g);
        imagem2.desenha(g);
    }
    //Exemplo do loop principal do jogo
    public void run() throws InterruptedException {
  
        while(jogoAtivo) {
            // faz as simulações fisicas
            
            
            // desenha a tela
            repaint();
            // delay de 10 milisegundos
            Thread.sleep(10);  
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressionei a tecla:"+e.getKeyChar());
        imagem1.teclaPressionada(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Liberei a tecla:"+e.getKeyChar());
        imagem1.teclaLiberada(e);
    }

    
}
