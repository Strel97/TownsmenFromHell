package com.strel.townsmen.engine;

import com.strel.townsmen.engine.utils.ImageLoader;
import com.strel.townsmen.game.GameConfig;

import java.awt.*;

/**
 * Created by strel on 20.05.15.
 */
public class GameFont {

    private Image font_img;


    public GameFont(String filename) {
        loadFont(filename);
    }

    /**
     * Loads font from image
     * @param filename  Path to image file
     */
    public void loadFont(String filename) {
        font_img = ImageLoader.loadImage(filename);
    }

    public void draw( Graphics2D g, String str, int x, int y ) {

        g.setColor(g.getBackground());

        int char_x = x;
        for (char c: str.toCharArray()) {
            // Coordinates of char in image file
            int sx, sy;

            sx = (c % 16) * GameConfig.FONT_SIZE;
            sy = (c / 16) * GameConfig.FONT_SIZE;

            g.drawImage(
                    font_img,
                    char_x, y, char_x + GameConfig.FONT_SIZE, y + GameConfig.FONT_SIZE,
                    sx, sy, sx + GameConfig.FONT_SIZE, sy + GameConfig.FONT_SIZE,
                    null
            );

            char_x += GameConfig.FONT_SIZE;
        }
    }
}
