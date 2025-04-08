package Example1.Subscriber;

import Example1.Publisher.Publisher;

//all subscriber has to implement this
public interface Subscriber {

    void update(Publisher context);
}
