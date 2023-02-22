# setup data source
#### create database
#### add application.properties to resource
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/dans
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=paramadaksa
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database=mysql
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
```
#### import postman collection
`DansQuiz.postman_collection.json`