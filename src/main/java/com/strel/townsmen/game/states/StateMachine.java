package com.strel.townsmen.game.states;

import java.awt.*;
import java.util.Stack;

/**
 * Created by strel on 09.06.15.
 */
public class StateMachine {

    private Stack<GameState> states;


    public StateMachine() {
        states = new Stack<GameState>();
    }

    public void setState(GameState state) {
        states.push(state);
    }

    public GameState getState() {
        return states.peek();
    }

    public void returnToPrevious() {
        states.pop();
    }

    public void update(long elapsedTime) {
        states.peek().update(elapsedTime);
    }

    public void draw(Graphics2D g) {
        states.peek().draw(g);
    }
}
