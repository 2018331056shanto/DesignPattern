package MultiThreadIssue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:2:26 PM</p>
 */
public class Singleton {

    private static  Singleton instance;
    public String value;

    private Singleton(String value){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.value=value;
    }
    public static Singleton getInstance(String value){
        if(instance==null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
