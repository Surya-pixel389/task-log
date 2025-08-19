package things;

public class User {
    private String username;
    private int xp;

    public User(String username){
        this.username = username;
        this.xp = 0;
    }
    public void earnXP(int value){
        xp += value;
    }
    public int getXP(){
        return xp;
    }
    public String getUsername(){
        return username;
    }
}
