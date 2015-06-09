package com.strel.game.old;

import javax.swing.*;

/**
 * Created by strel on 26.05.15.
 */
public class Launcher {
    public static void main(String[] args) {
        Game game = new Game();

        JFrame frame = new JFrame("Townsmen 4");
        frame.setSize(game.getCanvas().getSize());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(game.getCanvas());

        frame.setVisible(true);

        game.start();
    }
}
