Student Management System CRUD Operations-
----------------------------------------------------------------------
Create Student
Update Student
Delete Student
Display Student List
-----------------------------------------------------------------------
Backed -> Java, Spring Boot, Spring Data JPA, Spring Web MVC
Frontend -> HTML, Thymeleaf
Database -> MYSQL
-----------------------------------------------------------------------
Java Version -
		<java.version>21</java.version>
-----------------------------------------------------------------------
Spring Boot Version -
<artifactId>spring-boot-starter-parent</artifactId>
            <version>3.3.5</version>
-----------------------------------------------------------------------
use dependecy -
    <artifactId>spring-boot-starter-web</artifactId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <artifactId>mysql-connector-java</artifactId>
    <artifactId>spring-boot-devtools</artifactId>
----------------------------------------------------------------------------------
database application.properties file -
spring.datasource.url=jdbc:mysql://localhost:3306/yogesh
spring.datasource.username=root
spring.datasource.password=1234
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
-------------------------------------------------------------------------------------

        
