package SingleThread;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:2:23 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance("foo");
        Singleton singleton2=Singleton.getInstance("bar");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);

    }
}
