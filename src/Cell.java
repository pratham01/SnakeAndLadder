public class Cell {

    private int id ;
    private int value;

    public Cell(int id, int value){
        this.id = id;
        this.value =value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
