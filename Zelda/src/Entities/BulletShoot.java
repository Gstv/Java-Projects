/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import zelda.Game;

/**
 *
 * @author Guilherme Delmondes
 */
public class BulletShoot extends Entity {

    private double dx, dy;
    private double spd = 4;

    private int life = 10, curLife = 0;

    public BulletShoot(int x, int y, int width, int height, BufferedImage sprite, double dx, double dy) {
        super(x, y, width, height, sprite);
        this.dx = dx;
        this.dy = dy;
    }

    public void tick() {
        x += dx * spd;
        y += dy * spd;
        if (curLife == life) {
            Game.bullets.remove(this);
            return;
        }
    }

    public void render(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(this.getX() - Camera.x, this.getY() - Camera.y, 2, 2);
    }
}
