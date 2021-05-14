import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String secondName;
    private int burthyear;

    public Person(String name, String secondName, int burthyear) {
        this.name = name;
        this.secondName = secondName;
        this.burthyear = burthyear;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getBurthyear() {
        return burthyear;
    }
}
