package com.strel.townsmen.engine.game;

import com.strel.townsmen.engine.GameConfig;
import com.strel.townsmen.engine.GamePanel;
import com.strel.townsmen.engine.GameState;
import com.strel.townsmen.engine.input.InputHandler;
import com.strel.townsmen.engine.utils.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by strel on 18.05.15.
 */
public class Game implements Runnable {

    private static Game instance;

    private GamePanel canvas;
    private InputHandler input;
    private BufferedImage img;

    private boolean running;
    private Thread  thread;
    private int     fps;

    private GameState state;


    private Game() {
        canvas = new GamePanel();
        input = new InputHandler();

        canvas.addKeyListener(input);

        int width = Math.round(canvas.getWidth() / GameConfig.SCALE);
        int height = Math.round(canvas.getHeight() / GameConfig.SCALE);
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        ImageLoader.prepareImages();
    }

    public static Game getInstance() {
        if (instance == null)
            instance = new Game();

        return instance;
    }

    public void start() {
        if (running)
            return;

        state = new GamePaused();

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        if (!running)
            return;

        running = false;
    }

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();
        long currTime = startTime;

        int frames = 0;
        long time = 0;

        while (running) {
            long elapsedTime = System.currentTimeMillis() - currTime;
            currTime += elapsedTime;
            time += elapsedTime;

            if (time >= 1000) {
                fps = frames;

                frames = 0;
                time = 0;
            }

            update(elapsedTime);
            render();

            frames++;


            try {
                Thread.sleep(20);
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }

        System.exit(0);
    }

    public void handleInput() {
        if (input.isEscapePressed())
            stop();
        else if (input.isPkeyPressed())
            setState(new GamePaused());
    }

    public void update(long elapsedTime) {
        handleInput();

        if (!state.isComplete())
            state.update(elapsedTime);
        else
            changeState(state);
    }

    public void render() {
        Graphics2D g = (Graphics2D) img.getGraphics();

        canvas.render(g);
        state.draw(g);

        canvas.getGraphics().drawImage(img, 0, 0, canvas.getWidth(), canvas.getHeight(), null);

        g.dispose();
    }


    public GamePanel getCanvas() {
        return canvas;
    }

    public InputHandler getInputHandler() {
        return input;
    }

    public boolean isRunning() {
        return running;
    }

    public void changeState(GameState state) {
        if (state instanceof GamePaused)
            setState(new GameRunning());
        else if (state instanceof  GameRunning)
            setState(new GamePaused());
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public GameState getState() {
        return state;
    }
}
