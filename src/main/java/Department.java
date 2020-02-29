import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Department {

    String name;
    @JsonIgnore
    List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
