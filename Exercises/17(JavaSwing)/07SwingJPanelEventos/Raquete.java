
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio.aglubacheski
 */
public class Raquete{
        private int x; 
        private int y;
        private int largura;
        private int altura;
        private int vx;
        private Color cor;
	public Raquete(int x, int y, int largura, int altura, Color cor) {

                this.x = x;
                this.y = y;
                this.largura = largura;
                this.altura = altura;
                this.cor = cor;
	}

	public void move(int larguraJanela) {
            if (x + vx > 0 && x + vx <  larguraJanela-this.largura)
                x = x + vx;
	}

	public void desenha(Graphics g) {
            g.setColor(cor);
            g.fillRect(x, y, largura, altura);
	}

	public void teclaLiberada(KeyEvent e) {
		vx = 0;
	}

	public void teclaPressionada(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			vx = -2;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			vx = 2;
	}
        
        public Rectangle getRetangulo(){
            return new Rectangle(this.x, this.y, this.largura, this.altura);
        }

        public int getY() {
            return y;
        }
    
}
