package com.strel.townsmen.game.objects.entities.worker.states;

import com.strel.townsmen.game.GameConfig;
import com.strel.townsmen.game.ObjectMap;
import com.strel.townsmen.game.objects.entities.Entity;
import com.strel.townsmen.game.objects.entities.worker.Worker;
import com.strel.townsmen.game.objects.resources.ResourceObject;

import java.awt.*;

/**
 * Created by strel on 11.06.15.
 */
public class IdleState extends WorkerState {

    public IdleState(Worker worker) {
        super(worker);
    }

    @Override
    public void update(ObjectMap map, long elapsedTime) {
        // Finding resource object to gather
        ResourceObject res = map.find(GameConfig.TREE_OBJ);
        if (res != null)
            worker.setState(new GatherResourceState(worker, res));
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(GameConfig.IMG_WORKER, worker.getX(), worker.getY(), null);
    }

    @Override
    public boolean isComplete() {
        return false;
    }
}
