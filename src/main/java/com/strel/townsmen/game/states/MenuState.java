package com.strel.townsmen.game.states;


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
        g.setColor(Color.blue);
        g.fillRect(10, 10, 200, 150);
    }

    @Override
    public boolean isComplete() {
        return false;
    }
}
