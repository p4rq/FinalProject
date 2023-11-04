package Observer;

public class EmailMsgObserver{
    private String name;
    public EmailMsgObserver(String name,Observable observable) {
        this.name = name;
        observable.registerObserver(this);
    }
    void update(String news){
        System.out.println(name + " found out: " + news);
    }
}
