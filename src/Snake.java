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
        if(tail<=0 || head<= 0) {
            System.out.println("Head or Tail can't be negative");
            return false;
        }
        if(head == tail) {
            System.out.println("Head and Tail can't be equal");
            return false;
        }

        if(head<tail){
            System.out.println("Tail position can't be more than head");
            return false;
        }
        return true;
    }
}
