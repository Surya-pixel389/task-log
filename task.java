package things;

public abstract class task implements XPEarn {
    protected String title;
    protected boolean isComplete;

    public task(String title){
        this.title = title;
        this.isComplete = false;
    }
    public void taskComplete(){
        isComplete = true;
    }
    public boolean isComplete(){
        return isComplete;
    }
    public String getTitle(){
        return title;
    }
}
