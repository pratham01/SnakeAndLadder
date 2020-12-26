package com.deserve.snakeladder.dice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DiceTest {
    @Test
    public void testDiceValue(){
        Dice dice = new Dice();
        int diceValue = dice.getDiceValue();
        Assertions.assertTrue(diceValue >= dice.MIN);
        Assertions.assertTrue(diceValue <= dice.MAX);
    }

}