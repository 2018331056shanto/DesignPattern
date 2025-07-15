package MultiThreadIssue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:2:27 PM</p>
 */
public class Main {
    public static void main(String[] args) {

       new Thread(()->{
           System.out.println(Thread.currentThread().getName());
            Singleton singleton=Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }).start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            Singleton singleton=Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }).start();


    }
}
