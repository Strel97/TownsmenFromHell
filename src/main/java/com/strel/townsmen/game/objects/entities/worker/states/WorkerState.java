package com.strel.townsmen.game.objects.entities.worker.states;

import com.strel.townsmen.game.ObjectMap;
import com.strel.townsmen.game.objects.entities.Entity;
import com.strel.townsmen.game.objects.entities.worker.Worker;

import java.awt.*;

/**
 * Created by strel on 11.06.15.
 */
public abstract class WorkerState {

    protected Worker worker;


    public WorkerState(Worker worker) {
        this.worker = worker;
    }

    public abstract void update(ObjectMap map, long elapsedTime);
    public abstract void draw(Graphics2D g);
    public abstract boolean isComplete();
}
