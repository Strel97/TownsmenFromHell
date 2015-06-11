package com.strel.townsmen.game.objects.entities.worker;

import com.strel.townsmen.game.objects.entities.Entity;
import com.strel.townsmen.game.objects.entities.worker.states.IdleState;

import java.awt.*;

/**
 * Created by strel on 11.06.15.
 */
public class Worker extends Entity {

    public Worker(int x, int y) {
        super(x, y);
        setState(new IdleState(this));
    }

    @Override
    public void update(long elapsedTime) {
        state.update(elapsedTime);
    }

    @Override
    public void draw(Graphics2D g) {
        state.draw(g);
    }
}
