public class Ladder {

    public static final int INITIAL_POSITION = 1;
    private int start;
    private int end;

    public Ladder(int start, int end){
        this.start = start;
        this.end = end;
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }
}
