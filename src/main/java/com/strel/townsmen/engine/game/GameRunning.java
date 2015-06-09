package com.strel.townsmen.engine.game;

import com.strel.townsmen.engine.GameState;

import java.awt.*;

/**
 * Created by strel on 20.05.15.
 */
public class GameRunning implements GameState {

    public GameRunning() {
    }

    @Override
    public void update(long elapsedTime) {
    }

    @Override
    public void draw(Graphics2D g) {
    }

    @Override
    public boolean isComplete() {
        return !Game.getInstance().isRunning();
    }
}
