package com.strel.townsmen.game.states;


import com.strel.townsmen.engine.GameFont;
import com.strel.townsmen.game.TownsmenGame;

import java.awt.*;

/**
 * Created by strel on 20.05.15.
 */
public class MenuState implements GameState {

    public MenuState() {
    }

    public void handleInput() {
    }

    @Override
    public void update(long elapsedTime) {
        handleInput();
    }

    @Override
    public void draw(Graphics2D g) {
        GameFont font = TownsmenGame.getInstance().getFont();
        font.draw(g, "HELLO", 10, 10);
    }

    @Override
    public boolean isComplete() {
        return false;
    }
}
