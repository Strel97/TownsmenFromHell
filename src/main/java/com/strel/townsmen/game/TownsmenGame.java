package com.strel.townsmen.game;

import com.strel.townsmen.engine.GameFont;
import com.strel.townsmen.engine.game.GameCore;
import com.strel.townsmen.game.states.MenuState;
import com.strel.townsmen.game.states.StateMachine;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by strel on 09.06.15.
 */
public class TownsmenGame extends GameCore {

    private static TownsmenGame instance;

    private StateMachine state;

    private GameFont font;


    private TownsmenGame() {
        super();

        state = new StateMachine();
        state.setState(new MenuState());

        font = new GameFont("src/main/resources/font.png");
    }

    public static TownsmenGame getInstance() {
        if (instance == null)
            instance = new TownsmenGame();

        return instance;
    }

    public void handleInput() {
        if (input.keyDown(KeyEvent.VK_ESCAPE))
            stop();
    }

    public void update(long elapsedTime) {
        handleInput();
        state.update(elapsedTime);
    }

    public void render() {
        Graphics2D g = (Graphics2D) img.getGraphics();

        canvas.render(g);
        state.draw(g);

        canvas.getGraphics().drawImage(img, 0, 0, canvas.getWidth(), canvas.getHeight(), null);

        g.dispose();
    }


    public GameFont getFont() {
        return font;
    }
}
