/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import zelda.Game;

/**
 *
 * @author Guilherme Delmondes
 */
public class UI {

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(8, 4, 50, 8);
        g.setColor(Color.green);
        g.fillRect(8, 4, (int) ((Game.player.life / Game.player.maxLife) * 50), 8);
        g.setColor(Color.black);
        g.setFont(new Font("arial", Font.BOLD, 10));
        g.drawString((int) Game.player.life + "/" + (int) Game.player.maxLife, 10, 11);
    }
}
