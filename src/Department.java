import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;

    private List<Person> listStaff = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addPerson(Person person)
    {
        listStaff.add(person);
    }

    public String getName() {
        return name;
    }

    public List<Person> getListStaff() {
        return listStaff;
    }
}
