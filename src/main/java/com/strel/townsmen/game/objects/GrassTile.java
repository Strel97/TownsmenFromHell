package com.strel.townsmen.game.objects;

import com.strel.townsmen.game.GameConfig;

import java.awt.*;

/**
 * Created by strel on 10.06.15.
 */
public class GrassTile extends Tile {

    public GrassTile(int x, int y) {
        super(x, y);
    }

    @Override
    public void update(long elapsedTime) {

    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(GameConfig.IMG_GRASS, x, y, null);
    }
}
