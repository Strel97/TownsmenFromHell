package com.strel.game.old;

import com.strel.game.old.engine.Drawable;
import com.strel.game.old.engine.GameConfig;

import javax.swing.*;
import java.awt.*;

/**
 * Created by strel on 26.05.15.
 */
public class GamePanel extends JPanel implements Drawable {

    public GamePanel() {
        GameConfig config = GameConfig.getInstance();
        setSize(config.getIntegerProperty("FRAME_WIDTH"), config.getIntegerProperty("FRAME_WIDTH"));
    }

    @Override
    public void draw(Graphics g) {
        System.out.println("Color: " + GameConfig.getInstance().getIntegerProperty("FRAME_BACKGROUND"));
        g.setColor(new Color(GameConfig.getInstance().getIntegerProperty("FRAME_BACKGROUND")));
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
