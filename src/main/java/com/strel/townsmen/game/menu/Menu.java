package com.strel.townsmen.game.menu;

import com.strel.townsmen.engine.input.InputHandler;

import java.awt.*;

/**
 * Created by strel on 09.06.15.
 */
public class Menu {

    protected String[] options;
    protected int current;


    public Menu() {
        options = new String[] {};
        current = 0;
    }

    /**
     * Provides simple down / up navigation
     * in menu. It's similar for all menus,
     * so we implement it here.
     */
    public void handleInput(InputHandler input) {
        /*
        TODO: Navigation. Before must implement InputHandler.
         */
    }

    public void update(long elapsedTime) {
        /*
        TODO: Before must implement InputHandler.
         */
        handleInput(null);
    }

    public void draw(Graphics2D g) {
    }
}
