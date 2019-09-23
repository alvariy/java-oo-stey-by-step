package practice09;

public class Person {
    String name;
    int age;
    int id;

    public Person(int i1, String tom, int i) {
        this.name = tom;
        this.age = i;
        this.id = i1;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getId()
    {
        return id;
    }

    public String introduce() throws NoSuchFieldException, IllegalAccessException {
        return "My name is " +this.name+ ". I am " +this.age+" years old.";
    }
}