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
