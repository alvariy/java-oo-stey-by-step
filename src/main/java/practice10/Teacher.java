package practice10;

public class Teacher extends Person {

    Object klass;

    public Teacher(int i, String tom, int i1, Object klass) {
        super(i,tom,i1);
        this.klass = klass;
    }

    public Teacher(int i, String tom, int i1) {
        super(i,tom,i1);
    }


    public Object getKlass() {
        return klass;
    }

    public String introduce() throws NoSuchFieldException, IllegalAccessException {
        if(this.klass == null) {
            return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher. I teach No Class.";
        }
        else
        {
            return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher. I teach "
                    + this.klass.getClass().getDeclaredField("displayName").get(this.klass).toString() + ".";
        }

    }

    public String introduceWith(Student jerry) throws NoSuchFieldException, IllegalAccessException {

        if(this.klass.getClass().getDeclaredField("number").get(this.klass).toString() == jerry.klass.getClass().getDeclaredField("number").get(jerry.klass).toString() || this.klass == jerry.klass)
        {
            return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach " + jerry.name + ".";
        }
        else {

            return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I don't teach " + jerry.name + ".";
        }
    }
}
