package practice06;

public class Student extends Person{
    int klass;

    public Student(String tom, int i, int i1) {
        super(tom, i);
        this.klass = i1;
    }

    public int getKlass()
    {
        return klass;
    }

    public String introduce()
    {
        return super.introduce() + " I am a Student. I am at Class "+this.klass+".";
    }
}
