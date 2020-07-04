# java-json-xml
In Java, ObjectMapper is the simplest way to convert Java object to JSON and vise versa and it is included in jackson-databind project.Here we have demostrate simple java JSON convert example. We need to add jackson-databind to make availble ObjectMapper and other necessary Jackson dependencies.
In a maven project, We can add the dependency as follow : 
<br>
``` xml
 <dependencies>
    <dependency>
          <groupId>com.fasterxml.jackson.core</groupId>
          <artifactId>jackson-databind</artifactId>        
         <version>2.5.3</version>         
     </dependency>
  </dependencies>         
   ```
Simple Java object convert to JSON Example

``` java
public class Employee {
    
    Employee(String name,int age){
    setName(name);
    setAge(age);
    }
    String name;
    int age;
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 }
 //In Main class main method
ObjectMapper objectMapper = new ObjectMapper();
Employee emp = new Employee("Tharindu",25);
objectMapper.writeValue(new File("target/employee.json"), emp);
//{"name":"Tharindu","age":"25"}
```
**JSON to Java**
Let's see simple JSON Java converting exampel.

Simple JSON String:
String json = "{ \"name\" : \"Tharindu\", \"age\" : \"25\" }";
Employee emp = objectMapper.readValue(json, Employee.class);  

When JSON file in file system:
Employee emp = objectMapper.readValue(new File("path_to/json_emp.json"), Employee.class);

 As a URL:
Employee emp = objectMapper.readValue(new URL("file:src/test/resources/json_emp.json"), Employee.class);
