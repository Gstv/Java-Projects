
import java.awt.Color;
import java.awt.Graphics;
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
public class Jogo extends JPanel {
    private boolean jogoAtivo;
    private Bola b1;
    public Jogo(){
        
        JFrame frame = new JFrame("Ola Mundo Grafico");
       
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//desabilita maximizar janela
        frame.setVisible(true);
        frame.add(this); // adiciona o JPanel na janela
        
        this.setBackground( Color.white ); // muda cor de fundo do JPanel
        
        jogoAtivo = true;
        // Cria um bola
        b1 = new Bola(0, 0, 30, Color.red);
        
    }

    @Override
    public void paint(Graphics g) {
        // limpa a janela
        super.paint(g); 
        b1.desenha(g);
    }
    //Exemplo do loop principal do jogo
    public void run(){
  
        while(jogoAtivo) {
            // faz as simulações fisicas
            b1.move(this.getWidth(),this.getHeight()); // move a bolinha
            
            // desenha a tela
            repaint();
            
            // delay de 10 milisegudos
            // aguarda alguns milisegundos
            try {
                Thread.sleep(10);
            }catch(InterruptedException ex){
                System.out.println("erro na thread de espera");
            
            }
  
        }
    }

    
}
