package com.strel.townsmen.game.states;


import com.strel.townsmen.game.menu.MainMenu;
import com.strel.townsmen.game.menu.Menu;

import java.awt.*;

/**
 * Created by strel on 20.05.15.
 */
public class MenuState implements GameState {

    private Menu menu;


    public MenuState() {
        /*
        TODO: Maybe we must pass desired menu as parameter
         */
        menu = new MainMenu();
    }

    @Override
    public void update(long elapsedTime) {
        menu.update(elapsedTime);
    }

    @Override
    public void draw(Graphics2D g) {
        menu.draw(g);
    }

    @Override
    public boolean isComplete() {
        return false;
    }
}
