package practice07;

public class Klass {

    int number;
    String displayName;

    public Klass(int i) {
        this.number = i;
        this.displayName = "Class " + i;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }
}
