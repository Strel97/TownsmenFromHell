package com.strel.townsmen;

import com.strel.townsmen.engine.game.Game;

import javax.swing.*;

/**
 * Created by strel on 18.05.15.
 */
public class Launcher {
    public static void main(String[] args) {
        Game game = Game.getInstance();

        JFrame frame = new JFrame("Townsmen Clone");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(game.getCanvas().getSize());
        frame.setResizable(false);

        frame.add(game.getCanvas());

        frame.setVisible(true);

        game.start();
    }
}
