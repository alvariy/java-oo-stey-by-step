package practice06;

public class Teacher extends Person{

    int klass;

    public Teacher(String tom, int i, int i1) {
        super(tom,i);
        this.klass = i1;
    }

    public Teacher(String tom, int i) {
        super(tom,i);
    }

    public int getKlass()
    {
        return klass;
    }

    public String introduce()
    {
        if(this.klass != 0)
        {
            return super.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
        }
        else
        {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }


    }
}
