package com.strel.game.old.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by strel on 26.05.15.
 */
public class ConfigLoader {

    private static final String file_path = "src/main/resources/game_config.properties";


    public void load() {
        load(file_path);
    }

    public void load(String file) {
        try {
            GameConfig config = GameConfig.getInstance();

            FileInputStream fin = new FileInputStream(file);
            Properties prop = new Properties();

            prop.load(fin);

            for (Map.Entry<Object, Object> entry : prop.entrySet()) {
                config.add((String)entry.getKey(), (String)entry.getValue());
            }
        }
        catch (FileNotFoundException ex) {
            /**
             * Must be replaced by handling
             * with special error handler class
             */
            System.err.println("File Not Found!");
        }
        catch (IOException ex) {
            /**
             * Must be replaced by handling
             * with special error handler class
             */
            ex.printStackTrace();
        }
    }
}
