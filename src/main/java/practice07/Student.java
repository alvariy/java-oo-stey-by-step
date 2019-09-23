package practice07;

public class Student extends Person{
    Object klass;

    public Student(String tom, int i ,Object i1) {
        super(tom, i);
        this.klass = i1;
    }

    public Object getKlass()
    {
        return klass;
    }

    public String introduce() throws NoSuchFieldException, IllegalAccessException {
        return super.introduce() + " I am a Student. I am at Class "+this.klass.getClass().getDeclaredField("number").get(this.klass)+".";
    }
}
