package com.strel.townsmen.engine;

import com.strel.townsmen.engine.utils.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

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

    public static void draw( Graphics2D g, int num, int x, int y) {
        BufferedImage font = ImageLoader.loadImage("font.png");

        int len = 0;
        int n = num;
        while (n != 0) {
            n /= 10;
            len++;
        }

        int cnt = 0;        // The number of digits in number
        while (num != 0) {  // While we have at least one digit
            cnt++;

            g.drawImage(
                    font,
                    x + cnt * 12, y,                // Coordinates of draw
                    x + 12 + cnt * 12, y + 12,      // Width and Height coords
                    (num / len) * 6, 0,              // Coordinates in image
                    (num / len) * 6 + 6, 6,          // End coordinates in image
                    null
            );

            num %= len;
            len--;
        }
    }

    public void draw( Graphics2D g, String str, int x, int y ) {

        g.setColor(g.getBackground());

        int char_x = x;
        for (char c: str.toCharArray()) {
            g.drawImage(
                    font_img,
                    char_x, y, char_x + 16, y + 16,
                    (c - 'A') * GameConfig.FONT_SIZE,
                    GameConfig.FONT_IMG_LETTER_Y * GameConfig.FONT_SIZE,
                    (c - 'A') * GameConfig.FONT_SIZE + GameConfig.FONT_SIZE,
                    GameConfig.FONT_IMG_LETTER_Y * GameConfig.FONT_SIZE + GameConfig.FONT_SIZE,
                    null
            );

            char_x += 16;
        }
    }
}
