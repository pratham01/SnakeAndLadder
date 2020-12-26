package com.deserve.snakeladder.dice;

import java.util.Random;

public class CrookedDice implements RollDice {
    final static int MAX =8;
    final static int MIN =2;
    @Override
    public int getDiceValue() {
        Random rand = new Random();
        int randomNum = MIN+rand.nextInt((MAX-MIN)/2) *2;
        return randomNum;
    }
}
