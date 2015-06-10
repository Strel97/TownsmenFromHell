package com.strel.townsmen.game.states;

import com.strel.townsmen.game.ObjectMap;
import com.strel.townsmen.game.TileMap;
import com.strel.townsmen.game.objects.Player;
import com.strel.townsmen.game.states.GameState;

import java.awt.*;

/**
 * Created by strel on 20.05.15.
 */
public class RunningState implements GameState {

    private TileMap tileMap;
    private ObjectMap objectMap;
    private Player  player;


    public RunningState() {
        tileMap = new TileMap();
        objectMap = new ObjectMap();
        player = new Player(5, 10);
    }

    @Override
    public void update(long elapsedTime) {
        player.update(elapsedTime, objectMap);
    }

    @Override
    public void draw(Graphics2D g) {
        tileMap.draw(g);
        player.draw(g);
        objectMap.draw(g);
    }

    @Override
    public boolean isComplete() {
        return false;
    }
}
