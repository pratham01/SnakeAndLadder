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
        if(start<=0 || end<= 0){
            System.out.println("Start/End can't be negative");
            return false;
        }

        if(start == end){
            System.out.println("Start/End can't be equal");
            return false;
        }

        if(start>end){
            System.out.println("Start position can't be more than End");
            return false;
        }
        return true;
    }
}
