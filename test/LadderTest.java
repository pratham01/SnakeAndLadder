import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LadderTest {

    @Test
    public void validateLengthAndPositionOfLadder(){
        Ladder ladder = new Ladder(23, 45);

        Assertions.assertTrue(ladder.isValid());

        if(ladder.getStart() == Board.INITIAL_POSITION)
            Assertions.fail("Ladder can't place at this position");

    }
}
