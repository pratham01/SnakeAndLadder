import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LadderTest {

    @Test
    public void validateLengthOfSnake(){
        Ladder ladder = new Ladder(23, 45);

        if(ladder.getStart()<=0 || ladder.getEnd()<= 0)
            Assertions.fail("Start/End can't be negative");

        if(ladder.getStart() == ladder.getEnd())
            Assertions.fail("Start/End can't be equal");

        if(ladder.getStart()>ladder.getEnd())
            Assertions.fail("Start position can't be more than End");

        if(ladder.getStart() == Ladder.INITIAL_POSITION)
            Assertions.fail("Ladder can't place at this position");

    }
}
