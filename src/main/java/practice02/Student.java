package practice02;

public class Student extends Person{

    int klass;

    public Student(String tom, int i1, int i) {
        super(tom, i1);
        this.klass = i;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce()
    {
        return "I am a Student. I am at Class "+this.klass+".";
    }
}
