package com.strel.townsmen.game.objects;

import com.strel.townsmen.engine.input.InputHandler;
import com.strel.townsmen.game.GameConfig;
import com.strel.townsmen.game.ObjectMap;
import com.strel.townsmen.game.TownsmenGame;
import com.strel.townsmen.game.debug.Debugger;
import com.strel.townsmen.game.utils.IsometricConverter;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by strel on 10.06.15.
 */
public class Player {

    protected int x;
    protected int y;


    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void handleInput(ObjectMap map) {
        InputHandler input = TownsmenGame.getInstance().getInputHandler();
        if (input.keyDownOnce(KeyEvent.VK_DOWN)) {
            y += GameConfig.PLAYER_DY;
        }
        else if (input.keyDownOnce(KeyEvent.VK_UP)) {
            y -= GameConfig.PLAYER_DY;
        }
        else if (input.keyDownOnce(KeyEvent.VK_LEFT)) {
            x -= GameConfig.PLAYER_DX;
        }
        else if (input.keyDownOnce(KeyEvent.VK_RIGHT)) {
            x += GameConfig.PLAYER_DX;
        }
        else if (input.keyDownOnce(KeyEvent.VK_SPACE)) {
            Point isometric = IsometricConverter.tileCoordToIsometric(x, y);
            map.addObject(x, y, new House(isometric.x, isometric.y - GameConfig.OBJECT_MAP_Z));
        }
    }

    public void update(long elapsedTime, ObjectMap map) {
        handleInput(map);
    }

    public void draw(Graphics2D g) {
        Point isometric = IsometricConverter.tileCoordToIsometric(x, y);
        g.drawImage(GameConfig.IMG_PLAYER, isometric.x, isometric.y, null);

        g.setColor(GameConfig.DEBUG_WND_BACKGROUND);
        g.drawString("X=" + x + "  Y=" + y, 10, 10);
    }
}
