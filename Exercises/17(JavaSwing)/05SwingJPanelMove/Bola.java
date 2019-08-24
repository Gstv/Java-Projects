
import java.awt.Color;
import java.awt.Graphics;

public class Bola {
	private int x;
	private int y;
        private int lado;
	private int vx; // velocidade em y
	private int vy; // velocidade em y
        private Color cor;

	public Bola(int x, int y, int lado, Color cor) {
            this.x = x;
            this.y = y;
            this.lado = lado;
            this.cor = cor;
            this.vx = 1; // velocidade em x
            this.vy = 2; // velocidade em y
	}

	void move(int larguraJanela, int alturaJanela) {
		if ((x + vx < 0) || (x + vx > larguraJanela - lado))
			vx *=-1;
		if ((y + vy < 0) || (y + vy > alturaJanela - lado))
			vy *= -1;
		
		x = x + vx;
		y = y + vy;
	}

	public void desenha(Graphics g) {
            g.setColor(cor);
            g.fillOval(x, y, lado, lado);
	}
   
}
