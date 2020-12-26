package com.deserve.snakeladder.board;

public class Snake {

    private int head;
    private int tail;
    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public boolean isValid(){
        if(tail<=0 || head<= 0) throw new IllegalArgumentException("Head or Tail can't be negative/zero");
        if(head == tail) throw new IllegalArgumentException("Head and Tail can't be equal");
        if(head<tail)throw new IllegalArgumentException("Tail position can't be more than head");

        return true;
    }
}
