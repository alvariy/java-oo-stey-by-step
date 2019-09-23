package practice07;

public class Teacher extends Person{

    Object klass;

    public Teacher(String tom, int i, Object i1) {
        super(tom,i);
        this.klass = i1;
    }

    public Teacher(String tom, int i) {
        super(tom,i);
        this.klass = null;
    }

    public Object getKlass()
    {
        return klass;
    }

    public String introduce() throws NoSuchFieldException, IllegalAccessException {
        int num = 0;
        if(this.klass != null) {
           num  = Integer.parseInt(this.klass.getClass().getDeclaredField("number").get(this.klass).toString());
        }

        if(num != 0 || this.klass != null)
        {
            return super.introduce() + " I am a Teacher. I teach Class " + num + ".";
        }
        else
        {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }


    }

    public String introduceWith(Student jerry) {
        if(this.klass == jerry.klass)
        {
            return "My name is "+this.name+ ". I am " +this.age+ " years old. I am a Teacher. I teach "+jerry.getName()+".";
        }
        else
        {
            return "My name is "+this.name+ ". I am " +this.age+ " years old. I am a Teacher. I don't teach "+jerry.getName()+".";
        }

    }
}
