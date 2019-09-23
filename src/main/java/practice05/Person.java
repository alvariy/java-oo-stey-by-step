package practice05;

public class Person {

    String name;
    int age;

    public Person(String tom, int i) {
        this.name = tom;
        this.age = i;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public String introduce() {
        return "My name is " +this.name+ ". I am " +this.age+" years old.";
    }
}
