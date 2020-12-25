import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SnakeTest {

    @Test
    public void validateLengthOfSnake(){
        Snake snake = new Snake(10, 45);

        if(snake.getTail()<=0 || snake.getHead()<= 0)
            Assertions.fail("Head or Tail can't be negative");

        if(snake.getHead() == snake.getTail())
             Assertions.fail("Head and Tail can't be equal");

        if(snake.getHead()<snake.getTail())
            Assertions.fail("Tail position can't be more than head");

        if(snake.getHead() == Snake.FINAL_POSITION)
            Assertions.fail("Snake can't place at this position");

    }

}
