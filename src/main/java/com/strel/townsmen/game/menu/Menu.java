package com.strel.townsmen.game.menu;

import com.strel.townsmen.game.GameConfig;
import com.strel.townsmen.engine.GameFont;
import com.strel.townsmen.engine.input.InputHandler;
import com.strel.townsmen.game.TownsmenGame;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by strel on 09.06.15.
 */
public class Menu {

    protected String[] options;
    protected int current;


    public Menu() {
        options = new String[] {};
        current = 0;
    }

    /**
     * Provides simple down / up navigation
     * in menu. It's similar for all menus,
     * so we implement it here.
     */
    public void handleInput(InputHandler input) {
        if (input.keyDown(KeyEvent.VK_DOWN) && current != options.length - 1) {
            current++;
        }
        else if (input.keyDown(KeyEvent.VK_UP) && current != 0) {
            current--;
        }
    }

    public void update(long elapsedTime) {
        handleInput(TownsmenGame.getInstance().getInputHandler());
    }

    public void drawOptions(Graphics2D g, int x, int y) {
        GameFont font = TownsmenGame.getInstance().getFont();

        int y_step = y;
        for (String option : options) {
            // Pick out current option
            if (option.equals(options[current]))
                option = "> " + option;

            font.draw(g, option, x, y_step);
            y_step += GameConfig.MENU_OPTIONS_PADDING;
        }
    }

    public void draw(Graphics2D g) {
    }
}
