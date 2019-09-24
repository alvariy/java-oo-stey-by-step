package practice11;

public class Student extends Person{

    Object klass;


    public Student(int i, String jerry, int i1, Object klass) {
        super(i,jerry,i1);
        this.klass = klass;
    }

    public Object getKlass() {
        return klass;
    }

    public String introduce() throws NoSuchFieldException, IllegalAccessException {

        Object leader = this.klass.getClass().getDeclaredField("leader").get(this.klass);
        if(leader == null)
        {


            return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Student. I am at "
                    + this.klass.getClass().getDeclaredField("displayName").get(this.klass).toString() + ".";
        }
        else
        {
            return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Student. I am Leader of "
                    + this.klass.getClass().getDeclaredField("displayName").get(this.klass).toString() + ".";
        }
    }
}
