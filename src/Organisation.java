import java.util.ArrayList;
import java.util.List;

public class Organisation {
    private List<Department> listDepartment = new ArrayList<>();
    private Person director;

    public Organisation(Person director) {
        this.director = director;
    }

    public List<Department> getListDepartment() {
        return listDepartment;
    }

    public Person getDirector() {
        return director;
    }
    public void addDepartment(Department department)
    {
        listDepartment.add(department);
    }
}
