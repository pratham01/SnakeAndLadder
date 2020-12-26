package com.deserve.snakeladder.dice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrookedDiceTest {

    @Test
   public void testDiceValue(){
        CrookedDice dice = new CrookedDice();
        int diceValue = dice.getDiceValue();
        Assertions.assertTrue( diceValue %2 ==0);
        Assertions.assertTrue(diceValue >= CrookedDice.MIN);
        Assertions.assertTrue(diceValue <= CrookedDice.MAX);
    }
}