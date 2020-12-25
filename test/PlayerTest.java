import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void player(){
        Player player = new Player("ABC", "abc@gmail.com", "9999999999");

        Assertions.assertEquals(player.getName(), "ABC");

    }
}
