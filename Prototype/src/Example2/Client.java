package Example2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:4:29 PM</p>
 */
public class Client {
    private Map<String, Document> documents=new HashMap<>();
    public void addTemplates(String key,Document document){
        documents.put(key,document);
    }
    public Document createDocument(String key){
        return documents.get(key).clone();
    }
}
