package com.deserve.snakeladder.board;

import java.util.HashMap;
import java.util.Map;

public class Board {

    public static final int SIZE = 100;
    public static final int INITIAL_POSITION =0;

    Map<Integer, Cell> cellMap ;


    public Board(){
        cellMap = new HashMap<>();
    }

    public boolean addSnake(Snake snake){
        if(cellMap.containsKey(snake.getHead())){
            //Can't add snake at this position
            System.out.println("Can't add at this position");
            return false;
        }
        if(snake.isValid()) {
            Cell cell = new Cell(snake.getHead(), -snake.getTail());
            cellMap.put(snake.getHead(), cell);
            return true;
        }
        return false;
    }

    public boolean addLadder(Ladder ladder){

            if(cellMap.containsKey(ladder.getStart())){
                //Can't add ladder at this position
                System.out.println("Can't add at this position");
                return false;
            }
            if(ladder.isValid()){
                Cell cell = new Cell(ladder.getStart(),ladder.getEnd());
                cellMap.put(ladder.getStart(),cell);
                return true;
            }
        return false;
    }

    public int play(int diceValue, int playerPosition){

        if(diceValue+playerPosition > SIZE){
            //Skip
        } else if((diceValue+playerPosition) ==SIZE){
            //WINNER
        }
        if(cellMap.containsKey(diceValue+playerPosition))
            return cellMap.get(diceValue+playerPosition).getValue();
        else
            return playerPosition+1;
    }

}