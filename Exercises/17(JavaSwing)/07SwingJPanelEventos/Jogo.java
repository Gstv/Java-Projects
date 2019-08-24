
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
    private Bola b1;
    private Raquete r1;
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
        b1 = new Bola(0,0, 30, Color.red);
        r1 = new Raquete(frame.getWidth()/2, frame.getHeight()-40, 100, 10,Color.black);
    }

    @Override
    public void paint(Graphics g) {
        // limpa a janela
        super.paint(g);
        b1.desenha(g);
        r1.desenha(g);
    }
    //Exemplo do loop principal do jogo
    public void run() throws InterruptedException {
  
        while(jogoAtivo) {
            // faz as simulações fisicas
            r1.move(this.getWidth());
            b1.move(this.getWidth(),this.getHeight(),r1); // move a bolinha
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
        r1.teclaPressionada(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Liberei a tecla:"+e.getKeyChar());
        r1.teclaLiberada(e);
    }

    
}
