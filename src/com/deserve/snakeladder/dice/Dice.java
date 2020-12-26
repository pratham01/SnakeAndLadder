package com.deserve.snakeladder.dice;

public class Dice implements RollDice {
    final static int MAX =6;
    final static int MIN =1;

    @Override
    public int getDiceValue() {
        return (int) (Math.random()* (MAX - MIN + 1) + MIN);
    }
}
