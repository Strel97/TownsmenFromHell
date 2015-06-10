package com.strel.townsmen.game.objects;

import com.strel.townsmen.game.GameConfig;

import java.awt.*;

/**
 * Created by strel on 10.06.15.
 */
public class House extends GameObject {

    public House(int x, int y) {
        super(x, y);
    }

    @Override
    public void update(long elapsedTime) {

    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(GameConfig.IMG_HOUSE, x, y, null);
    }
}
