package Example2;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:4:29 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.addTemplates("Contract",new Contract("BS 23","1 Year"));
        client.addTemplates("Resume",new Resume("Shanto","java, guitar"));

        Document cloneContract=client.createDocument("Contract");
        Document cloneResume=client.createDocument("Resume");
        cloneContract.printContent();
        cloneResume.printContent();
    }
}
