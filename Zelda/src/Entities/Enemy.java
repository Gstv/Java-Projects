/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import World.World;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import zelda.Game;

/**
 *
 * @author Guilherme Delmondes
 */
public class Enemy extends Entity {

    private double speed = 0.6;

    private int frames = 0, maxFrames = 20, index = 0, maxIndex = 1;
    private int maskX = 8, maskY = 8, maskW = 10, maskH = 10;
    private int life = 10;

    private boolean isDamaged = false;
    private int damageFrames = 10, damageCurrent = 0;

    private BufferedImage[] sprites;

    public Enemy(int x, int y, int width, int height, BufferedImage sprite) {
        super(x, y, width, height, null);
        sprites = new BufferedImage[2];
        sprites[0] = Game.spritesheet.getSprite(112, 16, 16, 16);
        sprites[1] = Game.spritesheet.getSprite(128, 16, 16, 16);
    }

    public void tick() {
        if (this.isCollidingWithPlayer() == false) {
            if ((int) x < Game.player.getX() && World.isFree((int) (x + speed), this.getY())
                    && !isColliding((int) (x + speed), this.getY())) {
                x += speed;
            } else if ((int) x > Game.player.getX() && World.isFree((int) (x - speed), this.getY())
                    && !isColliding((int) (x - speed), this.getY())) {
                x -= speed;
            } else if ((int) y < Game.player.getY() && World.isFree(this.getX(), (int) (y + speed))
                    && !isColliding(this.getX(), (int) (y + speed))) {
                y += speed;
            } else if ((int) y > Game.player.getY() && World.isFree(this.getX(), (int) (y - speed))
                    && !isColliding(this.getX(), (int) (y - speed))) {
                y -= speed;
            }
        } else {
            //Colidiu
            if (Game.rand.nextInt(100) < 10) {
                Game.player.life--;
                Game.player.isDamaged = true;
            }

        }

        frames++;
        if (frames == maxFrames) {
            frames = 0;
            index++;
            if (index > maxIndex) {
                index = 0;
            }
        }
        collidingBullet();
        if (life <= 0) {
            destroySelf();
            return;
        }

        if (isDamaged) {
            this.damageCurrent++;
            if (this.damageCurrent == this.damageFrames) {
                this.damageCurrent = 0;
                this.isDamaged = false;
            }
        }

    }

    public void destroySelf() {
        Game.entities.remove(this);
        Game.enemies.remove(this);
    }

    public void collidingBullet() {
        for (int i = 0; i < Game.bullets.size(); i++) {
            Entity e = Game.bullets.get(i);
            if (e instanceof BulletShoot) {
                if (Entity.isColliding(this, e)) {
                    isDamaged = true;
                    life--;
                    Game.bullets.remove(i);
                    return;
                }
            }
        }
    }

    public boolean isCollidingWithPlayer() {
        Rectangle enemyCurrent = new Rectangle(this.getX() + maskX, this.getY() + maskY, maskW, maskH);
        Rectangle player = new Rectangle(Game.player.getX(), Game.player.getY(), 16, 16);

        return enemyCurrent.intersects(player);
    }

    public boolean isColliding(int xNext, int yNext) {
        Rectangle enemyCurrent = new Rectangle(xNext, yNext, World.TILE_SIZE, World.TILE_SIZE);

        for (int i = 0; i < Game.enemies.size(); i++) {
            Enemy e = Game.enemies.get(i);
            if (e == this) {
                continue;
            }
            Rectangle targetEnemy = new Rectangle(e.getX(), e.getY(), World.TILE_SIZE, World.TILE_SIZE);
            if (enemyCurrent.intersects(targetEnemy)) {
                return true;
            }
        }
        return false;
    }

    public void render(Graphics g) {
        if (!isDamaged) {
            g.drawImage(sprites[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
        } else {
            g.drawImage(Entity.ENEMY_FEEDBACK, this.getX() - Camera.x, this.getY() - Camera.y, null);
        }
        //g.setColor(Color.blue);
        //g.fillRect(this.getX() + maskX - Camera.x,this.getY() + maskY - Camera.y, maskW,maskH);
    }

}
