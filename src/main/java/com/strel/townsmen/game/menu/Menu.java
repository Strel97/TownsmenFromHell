package com.strel.townsmen.game.menu;

import com.strel.townsmen.engine.GameConfig;
import com.strel.townsmen.engine.GameFont;
import com.strel.townsmen.engine.input.InputHandler;
import com.strel.townsmen.game.TownsmenGame;

import java.awt.*;

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
        /*
        TODO: Navigation. Before must implement InputHandler.
         */
    }

    public void update(long elapsedTime) {
        /*
        TODO: Before must implement InputHandler.
         */
        handleInput(null);
    }

    public void drawAt(Graphics2D g, int x, int y) {
        GameFont font = TownsmenGame.getInstance().getFont();

        int y_step = y;
        for (String option : options) {
            font.draw(g, option, x, y_step);
            y_step += GameConfig.MENU_OPTIONS_PADDING;
        }
    }

    public void draw(Graphics2D g) {

    }
}
