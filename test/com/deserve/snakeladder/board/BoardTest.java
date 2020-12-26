package com.deserve.snakeladder.board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    public void boardSize(){
        Assertions.assertEquals(100, Board.SIZE);
    }

    @Test
    public void testAddSnakeLadder(){
        Board board = new Board();
        Snake snake = new Snake(12,3);
        Assertions.assertTrue(board.addSnake(snake));
        Ladder ladder = new Ladder(10, 34);
        Assertions.assertTrue(board.addLadder(ladder));
    }

    @Test
    public void testPlay(){
        Board board= new Board();
        board.addLadder(new Ladder(10,30));
        board.addLadder(new Ladder(6,36));
        board.addSnake(new Snake(46,22));
        board.addSnake(new Snake(98,3));

        Assertions.assertEquals(36, board.play(6,0) );
        Assertions.assertEquals(22, board.play(4, 42));
    }
}
