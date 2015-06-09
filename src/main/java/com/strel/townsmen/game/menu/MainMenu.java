package com.strel.townsmen.game.menu;

import java.awt.*;

/**
 * Created by strel on 09.06.15.
 */
public class MainMenu extends Menu {

    private String[] options = {
        "New Game",
            "Quit"
    };


    public MainMenu() {

    }

    public void handleInput() {

    }

    public void update(long elapsedTime) {
        super.update(elapsedTime);
        handleInput();
    }

    public void draw(Graphics2D g) {
        /*
        TODO: Drawing options via engine.Font class
         */
    }
}
