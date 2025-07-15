package MultiThreadIssueFix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:2:33 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            SingletonFix singletonFix = SingletonFix.getInstance("FOO");
            System.out.println(singletonFix.value);
        }).start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            SingletonFix singletonFix = SingletonFix.getInstance("BAR");
            System.out.println(singletonFix.value);
        }).start();
    }
}
