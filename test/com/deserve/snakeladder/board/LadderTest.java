package com.deserve.snakeladder.board;

import com.deserve.snakeladder.board.Board;
import com.deserve.snakeladder.board.Ladder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LadderTest {

    @Test
    public void validateLengthAndPositionOfLadder(){
        Ladder ladder = new Ladder(23, 45);

        Assertions.assertTrue(ladder.isValid());

        if(ladder.getStart() == Board.INITIAL_POSITION)
            Assertions.fail("com.deserve.snakeladder.board.Ladder can't place at this position");

    }
}
