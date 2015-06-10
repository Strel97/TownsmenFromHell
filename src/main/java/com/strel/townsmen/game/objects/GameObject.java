package com.strel.townsmen.game.objects;

import java.awt.*;

/**
 * Created by strel on 10.06.15.
 */
public abstract class GameObject {

    protected int x;
    protected int y;


    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void update(long elapsedTime);
    public abstract void draw(Graphics2D g);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
