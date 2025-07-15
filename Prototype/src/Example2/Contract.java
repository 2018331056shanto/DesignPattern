package Example2;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:4:24 PM</p>
 */
public class Contract implements Document{
    private String clientName;
    private String terms;

    public Contract(String clientName, String terms) {
        this.clientName = clientName;
        this.terms = terms;
    }
    @Override
    public Document clone() {
        return new Contract(this.clientName, this.terms);
    }

    @Override
    public void printContent() {

        System.out.println("Contract with "+clientName+" - Terms:  "+terms);
    }
}
