package Example1.Publisher;

import Example1.Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    //List of Subscribers
    List<Subscriber> subscribers=new ArrayList<>();
    private String mainState;
    public Publisher(String mainState) {
        this.mainState=mainState;
    }
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);

    }
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(){
        for(Subscriber subscriber:subscribers){
            subscriber.update(this);
        }
    }
    public String getMainState() {
        return mainState;
    }
    public void mainBusinessLogic(String newState) {
        this.mainState=newState;
        notifySubscribers();
    }

}
