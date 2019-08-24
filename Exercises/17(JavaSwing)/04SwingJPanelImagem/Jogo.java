import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * referencias:
 * http://abrindoojogo.com.br/djj-07
 * http://pontov.com.br/site/java/48-java2d/111-trabalhando-com-imagens
 */

/**
 *
 * @author fabio.aglubacheski
 */
public class Jogo extends JPanel {
    private BufferedImage imagem;
    public Jogo(){
        
        JFrame frame = new JFrame("Ola Mundo Grafico");
       
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//desabilita maximizar janela
        frame.setVisible(true);
        frame.add(this); // adiciona o JPanel na janela
        
        //this.setBackground( Color.white ); // seta que o fundo da janela eh branco
        this.setBackground( Color.magenta ); // seta que o fundo da janela eh branco
        
        // carrega uma imagem
        try {
            // a imagem deve estar na pasta base do projeto
            // para esse projeto seria .\01SwingJPanelImagem
            imagem = ImageIO.read(new File("smiley.bmp"));
        }catch (IOException e) {
            System.out.println("Impossosivel carregar a imagem:"+e);
        }
        
    }

    @Override
    public void paint(Graphics g) {
        // limpa a janela
        super.paint(g);
        
        // desenha a imagem no canto da tela
        g.drawImage(this.imagem,0,0, null);
        
    }
    
}
