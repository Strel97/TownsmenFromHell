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
public class MainMenu extends Menu {

    private static final String logo = "TOWNSMEN";

    private static final int NEWGAME_OPTION = 0;
    private static final int EXIT_OPTION = 1;


    public MainMenu() {
        options = new String[] {
                "New Game",
                "Exit"
        };
    }

    public void handleInput() {
        InputHandler input = TownsmenGame.getInstance().getInputHandler();
        if (input.keyDown(KeyEvent.VK_ENTER)) {
            if (current == EXIT_OPTION)
                TownsmenGame.getInstance().stop();
            else if (current == NEWGAME_OPTION)
                TownsmenGame.getInstance().newGame();
        }
    }

    public void update(long elapsedTime) {
        super.update(elapsedTime);
        handleInput();
    }

    public void draw(Graphics2D g) {

        GameFont font = TownsmenGame.getInstance().getFont();

        font.draw(g, logo, 160, 20);
        super.drawOptions(g, GameConfig.MENU_MAIN_X, GameConfig.MENU_MAIN_Y);
    }
}
