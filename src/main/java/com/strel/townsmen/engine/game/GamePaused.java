package com.strel.townsmen.engine.game;

import com.strel.townsmen.engine.GameState;
import com.strel.townsmen.engine.input.InputHandler;

import java.awt.*;

/**
 * Created by strel on 20.05.15.
 */
public class GamePaused implements GameState {

    private boolean paused;


    public GamePaused() {
        paused = true;
    }

    public void handleInput() {
        InputHandler input = Game.getInstance().getInputHandler();
        if (input.isSpacePressed())
            paused = false;
    }

    @Override
    public void update(long elapsedTime) {
        handleInput();
    }

    @Override
    public void draw(Graphics2D g) {
    }

    @Override
    public boolean isComplete() {
        return !paused;
    }
}
