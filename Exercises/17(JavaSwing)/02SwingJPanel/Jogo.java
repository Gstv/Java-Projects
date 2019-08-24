
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
    public Jogo(){
        
        JFrame frame = new JFrame("Ola Mundo Grafico");
       
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//desabilita maximizar janela
        frame.setVisible(true);
        frame.add(this); // adiciona o JPanel na janela
        
        this.setBackground( Color.white ); // seta que o fundo da janela eh branco
        
    }

    @Override
    public void paint(Graphics g) {
        // limpa a janela
        super.paint(g);
        g.setColor(Color.black);
        g.fillOval(0, 0, 50, 50);
    }
    
}
