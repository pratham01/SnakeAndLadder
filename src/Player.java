public class Player implements RollDice{
    private  String name;
    private String email;
    private String  contactNo;

    private final static int MAX =6;
    private final static int MIN =1;

    public Player(String name, String email, String contactNo) {
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }

    @Override
    public int getDiceValue() {
       return (int) (Math.random()* (MAX - MIN + 1) + MIN);
    }
}
