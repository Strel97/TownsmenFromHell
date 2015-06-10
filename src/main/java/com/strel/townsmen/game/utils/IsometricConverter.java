package com.strel.townsmen.game.utils;

import com.strel.townsmen.game.GameConfig;

import java.awt.*;

/**
 * Created by strel on 11.06.15.
 */
public class IsometricConverter {

    public static Point tileCoordToIsometric(int tile_x, int tile_y) {
        // Coordinates in cartesian coord system
        int cart_x = tile_x * (GameConfig.TILE_SIZE / 2 - 1);
        int cart_y = tile_y * (GameConfig.TILE_SIZE / 2 - 1);

        // Coordinates in isometric system
        int x = cart_x - cart_y + GameConfig.DEFAULT_WIDTH / (2 * GameConfig.SCALE) - 30;
        int y = (cart_x + cart_y) / 2 + GameConfig.DEFAULT_HEIGHT / (2 * GameConfig.SCALE)  - 30;

        return new Point(x, y);
    }
}
