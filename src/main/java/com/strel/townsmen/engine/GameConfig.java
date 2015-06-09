package com.strel.townsmen.engine;

import java.awt.*;

/**
 * Created by strel on 19.05.15.
 */
public interface GameConfig {

    public int DEFAULT_WIDTH            = 1000;
    public int DEFAULT_HEIGHT           = 500;
    public int SCALE                    = 3;

    public Color COLOR_BACKGROUND       = new Color(0x000000);
    public Color COLOR_ENTITY           = new Color(0xFFFFFF);

    // Map tiles constants
    public int GRASS_TILE = 0;
}
