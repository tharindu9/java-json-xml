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
ObjectMapper objectMapper = new ObjectMapper();
public class Employee {

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
```
