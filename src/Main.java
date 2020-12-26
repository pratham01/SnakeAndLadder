import com.deserve.snakeladder.board.Board;
import com.deserve.snakeladder.board.Ladder;
import com.deserve.snakeladder.board.Snake;
import com.deserve.snakeladder.dice.CrookedDice;

public class Main {
    public static void main(String[] args) {

        Board board = initialize();
        int position=0;
        Player player = new Player("AA","aa@yahoo.com","1234567890");
        CrookedDice dice = new CrookedDice();

        for (int i=0;i<10;i++){
            int diceValue = dice.getDiceValue();
            System.out.println("Dice value is "+ diceValue);
            position = board.play(diceValue, position);
            System.out.println("Player position is "+position);
        }
    }

    private static Board initialize(){
        Board board= new Board();
        board.addLadder(new Ladder(10,30));
        board.addLadder(new Ladder(6,36));
        board.addSnake(new Snake(46,22));
        board.addSnake(new Snake(98,3));
        board.addSnake(new Snake(28,12));
        board.addSnake(new Snake(34,25));
        return board;
    }
}
