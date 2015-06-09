package com.strel.game.old.engine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by strel on 26.05.15.
 */
public class GameConfig {

    /**
     * Class is singleton to
     * give access to it in
     * any line of code.
     */
    private static GameConfig instance;

    /**
     * Contains all game configuration
     * in such form:
     * FRAME_WIDTH => 100
     */
    private Map<String, String> config;


    private GameConfig() {
        config = new HashMap<String, String>();
    }

    public static GameConfig getInstance() {
        if (instance == null)
            instance = new GameConfig();

        return instance;
    }

    public void add(String property, String value) {
        config.put(property, value);
    }

    public void add(String property, int value) {
        add(property, String.valueOf(value));
    }

    public String getStringProperty(String property) {
        return config.get(property);
    }

    public int getIntegerProperty(String property) { return Integer.valueOf(config.get(property)); }
}
