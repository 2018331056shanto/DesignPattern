package Example2;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:4:26 PM</p>
 */
public class Resume implements Document{
    private String candidateName;
    private String skills;
    public Resume(String candidateName, String skills){
        this.candidateName = candidateName;
        this.skills = skills;
    }
    @Override
    public Document clone() {
        return new Resume(this.candidateName, this.skills);
    }

    @Override
    public void printContent() {

        System.out.println("Resume of "+candidateName+" -skills: "+skills);
    }
}
