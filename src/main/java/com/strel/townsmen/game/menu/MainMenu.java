package com.strel.townsmen.game.menu;

import com.strel.townsmen.engine.GameConfig;

import java.awt.*;

/**
 * Created by strel on 09.06.15.
 */
public class MainMenu extends Menu {

    public MainMenu() {
        options = new String[] {
                "NEW GAME",
                "EXIT"
        };
    }

    public void handleInput() {

    }

    public void update(long elapsedTime) {
        super.update(elapsedTime);
        handleInput();
    }

    public void draw(Graphics2D g) {
        super.drawAt(g, GameConfig.MENU_MAIN_X, GameConfig.MENU_MAIN_Y);
    }
}
