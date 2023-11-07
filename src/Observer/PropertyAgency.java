package Observer;

import java.util.ArrayList;
import java.util.List;

public class PropertyAgency implements Observable{
    private final List<EmailMsgObserver> customers;
    private String newsAgency;
    public PropertyAgency(){
        customers = new ArrayList<>();
    }
    public void setNewsAgency(String news) {
        this.newsAgency = news;
        notifyObserver();
    }


    @Override
    public void registerObserver(Observer.EmailMsgObserver o) {
        customers.add(o);
    }

    @Override
    public void removeObserver(EmailMsgObserver o) {
        customers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (EmailMsgObserver o : customers)
            o.update(newsAgency);
    }
}
