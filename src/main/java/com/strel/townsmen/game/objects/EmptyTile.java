package com.strel.townsmen.game.objects;

import java.awt.*;

/**
 * Created by strel on 10.06.15.
 */
public class EmptyTile extends Tile {

    public EmptyTile(int x, int y) {
        super(x, y);
    }

    @Override
    public void update(long elapsedTime) {

    }

    @Override
    public void draw(Graphics2D g) {

    }
}
