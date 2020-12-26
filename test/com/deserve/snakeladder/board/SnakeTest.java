package com.deserve.snakeladder.board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SnakeTest {

    @Test
    public void validateLengthAndPositionOfSnake(){
        Snake snake = new Snake(89, 45);
        Assertions.assertTrue(snake.isValid());
        
            if(snake.getHead() == Board.SIZE)
                Assertions.fail("com.deserve.snakeladder.board.Snake can't place at this position");

    }

}
