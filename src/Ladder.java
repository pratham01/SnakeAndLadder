public class Ladder {

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

    public boolean isValid(){
        if(start<=0 || end<= 0) throw new IllegalArgumentException("Start/End can't be negative");
        if(start == end) throw new IllegalArgumentException("Start/End can't be equal");
        if(start>end) throw new IllegalArgumentException("Start position can't be more than End");

        return true;
    }
}
