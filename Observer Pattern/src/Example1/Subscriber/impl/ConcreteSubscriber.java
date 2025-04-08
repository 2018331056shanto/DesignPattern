package Example1.Subscriber.impl;

import Example1.Publisher.Publisher;
import Example1.Subscriber.Subscriber;

import java.util.concurrent.Flow;

public class ConcreteSubscriber implements Subscriber {
    private String name;
    public ConcreteSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(Publisher context) {

        System.out.println(name + " received " + context.getMainState());

    }
}
