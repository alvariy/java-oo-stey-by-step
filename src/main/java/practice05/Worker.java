package practice05;

public class Worker extends Person{

    public Worker(String tom, int i) {
        super(tom,i);
    }

    public String introduce()
    {
        return super.introduce() + " I am a Worker. I have a job.";
    }
}
