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
public class GatherResourceState extends WorkerState {

    private ResourceObject targetResource;


    public GatherResourceState(Worker worker, ResourceObject resource) {
        super(worker);
        targetResource = resource;
    }

    @Override
    public void update(ObjectMap map, long elapsedTime) {
        worker.stepTo( targetResource );

        if (worker.reached( targetResource )) {
            worker.gather( targetResource );
            worker.setState(new BringResourceState(worker));
        }
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
