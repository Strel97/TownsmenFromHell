package com.strel.townsmen.game.debug;

import com.strel.townsmen.game.GameConfig;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by strel on 10.06.15.
 */
public class Debugger {

    private static ArrayList<Object> watches;


    public static void addWatch(Object var) {
        watches.add(var);
    }

    public static void draw(Graphics2D g) {
        g.setColor(GameConfig.DEBUG_WND_BACKGROUND);
        g.fillRect(
                GameConfig.DEBUG_WND_X, GameConfig.DEBUG_WND_Y,
                GameConfig.DEFAULT_WIDTH, GameConfig.DEFAULT_HEIGHT
        );

        int x = GameConfig.DEBUG_WND_X + 5;
        int y = GameConfig.DEBUG_WND_X + 5;

        g.setColor(GameConfig.DEBUG_WND_FOREGROUND);
        for (Object var : watches) {
            g.drawString(var.toString(), x, y);
            y++;
        }
    }
}
