import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = createEmployee();

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);

        System.out.println(jsonString);
    }

    public static Employee createEmployee(){
        Employee employee = new Employee();
        employee.setAge(25);
        employee.setName("Tharindu");
        List<String> numbers = new ArrayList<String>();
        numbers.add("0775689292");
        numbers.add("0785459292");
        numbers.add("0775645892");

        Department department = new Department();
        department.setName("HR");
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee);
        department.setEmployees(employees);
        employee.setNumbers(numbers);
        employee.setDepartment(department);
        return employee;
    }
}
