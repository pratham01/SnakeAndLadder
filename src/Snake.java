public class Snake {
    public static final int FINAL_POSITION = 100;

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
}
