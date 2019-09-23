package practice10;

public class Klass {

    int number;
    String displayName;
    Object leader;
    Object member;

    public Klass(int i) {
        this.number = i;
        this.displayName = "Class " +i;
    }

    public int getNumber()
    {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void assignLeader(Student jerry) {
        this.leader = jerry;
    }

    public Object getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        this.member = jerry;
    }
}
