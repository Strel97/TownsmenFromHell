package com.strel.townsmen.game.objects.entities;

import com.strel.townsmen.game.objects.GameObject;
import com.strel.townsmen.game.objects.entities.worker.states.WorkerState;

/**
 * Created by strel on 11.06.15.
 */
public abstract class Entity extends GameObject {

    protected WorkerState state;


    public Entity(int x, int y) {
        super(x, y);
    }

    public void setState(WorkerState state) {
        this.state = state;
    }
}
