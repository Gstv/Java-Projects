
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio.aglubacheski
 */
public class Jogo extends JFrame{
    public Jogo(){
        super("Ola Mundo Grafico");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//desabilita maximizar janela
        this.setBackground( Color.white ); // seta que o fundo da janela eh branco
    }
    @Override
    public void paint(Graphics g) {
     // limpa a janela
        g.setColor(Color.red);
        g.fillOval(0, 0, 50, 50);
    }
    /*
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(750, 550, 50, 50);
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.darkGray);
        g.fillOval(150, 200, 200, 40);
        g.setColor(Color.red);
        g.fillOval(100, 80, 150, 150);
        g.setColor(Color.pink);
        g.fillOval(120, 105, 30, 30);
        g.setColor(Color.blue);
        g.setFont(new Font("Arial Bold", Font.PLAIN, 36));
        g.drawString("Projeto Integrador III", 30, 50);
    }
    */   

}
