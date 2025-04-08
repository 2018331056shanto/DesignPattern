package Example1;
import Example1.Publisher.Publisher;
import Example1.Subscriber.Subscriber;
import Example1.Subscriber.impl.ConcreteSubscriber;

public class Main {
    public static void main(String[] args) {

        Publisher publisher=new Publisher("Hello World MainState");
        Subscriber subscriber1=new ConcreteSubscriber("Subscriber 1 ");
        Subscriber subscriber2=new ConcreteSubscriber("Subscriber 2 ");
        Subscriber subscriber3=new ConcreteSubscriber("Subscriber 3 ");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        publisher.mainBusinessLogic("Hello World new state 1");

        publisher.unsubscribe(subscriber2);

        publisher.mainBusinessLogic("Hello World new state 2");
    }
}