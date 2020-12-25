import java.util.HashMap;
import java.util.Map;

public class Board {

    public static final int SIZE = 100;
    public static final int INITIAL_POSITION =0;

    Map<Integer, Cell> cellMap ;


    public Board(){
        cellMap = new HashMap<>();
    }

    public void addSnake(Snake snake){
        if(cellMap.containsKey(snake.getHead())){
            //Can't add snake at this position
        }
        Cell cell = new Cell(snake.getHead(),-snake.getTail());
        cellMap.put(snake.getHead(),cell);

    }

    public void addLadder(Ladder ladder){

            if(cellMap.containsKey(ladder.getStart())){
                //Can't add ladder at this position
            }
            Cell cell = new Cell(ladder.getStart(),ladder.getEnd());
            cellMap.put(ladder.getStart(),cell);

    }

}