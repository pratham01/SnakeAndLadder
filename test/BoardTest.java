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
}
