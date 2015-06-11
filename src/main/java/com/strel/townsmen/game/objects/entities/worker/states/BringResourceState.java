package com.strel.townsmen.game.objects.entities.worker.states;

import com.strel.townsmen.game.GameConfig;
import com.strel.townsmen.game.ObjectMap;
import com.strel.townsmen.game.objects.entities.worker.Worker;

import java.awt.*;

/**
 * Created by strel on 11.06.15.
 */
public class BringResourceState extends WorkerState {

    public BringResourceState(Worker worker) {
        super(worker);
    }

    @Override
    public void update(ObjectMap map, long elapsedTime) {
        Storage storage = map.find(GameConfig.STORAGE_OBJ);
        worker.moveTo( storage );
        storage.add( worker.getBagContents() );
    }

    @Override
    public void draw(Graphics2D g) {

    }

    @Override
    public boolean isComplete() {
        return false;
    }
}
