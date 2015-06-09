package com.strel.game.old;

import com.strel.game.old.engine.ConfigLoader;
import com.strel.game.old.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by strel on 26.05.15.
 */
public class Game implements Runnable {

    private boolean running;
    private Thread  thread;
    private BufferedImage offscreen_img;

    private GamePanel canvas;


    public Game() {
        // Game in not running state
        running = false;

        // Loads all game configuration
        // After this, we have access
        // via GameConfig singleton object.
        ConfigLoader loader = new ConfigLoader();
        loader.load();

        canvas = new GamePanel();
    }

    public void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {

            draw();

            try {
                Thread.sleep(20);
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void draw() {
        Graphics g = offscreen_img.getGraphics();

        canvas.draw(g);

        canvas.getGraphics().drawImage(offscreen_img, 0, 0, canvas.getWidth(), canvas.getHeight(), null);
        g.dispose();
    }


    public GamePanel getCanvas() {
        return canvas;
    }
}
