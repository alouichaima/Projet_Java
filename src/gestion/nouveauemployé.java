package gestion;
import java.util.ArrayList;
import java.util.List;


public class nouveauemployé {
	private List<employée> employees;

    public nouveauemployé() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(employée employee) {
        this.employees.add(employee);
    }

    public List<employée> getEmployees() {
        return this.employees;
    }
}