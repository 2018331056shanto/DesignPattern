package MultiThreadIssueFix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:2:32 PM</p>
 */
public class SingletonFix {

    private static volatile SingletonFix instance;
    public String value;
    private SingletonFix(String value){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.value=value;
    }

    public static SingletonFix getInstance(String value){

        SingletonFix singleton=instance;
        if(singleton!=null){
            return singleton;
        }
        synchronized (SingletonFix.class){
            if(instance==null){
                instance=new SingletonFix(value);
            }
        }
        return instance;
    }
}
