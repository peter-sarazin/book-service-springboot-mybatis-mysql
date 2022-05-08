# book-service-springboot-mybatis-mysql

github repository:
https://github.com/peter-sarazin/book-service-springboot-mybatis-mysql

This is a sandbox project for the purpose of getting up and running with MyBatis.

It is a RESTful service for a book collection using SpringBoot, MyBatis, and MySQL.

The MySQL database it uses is defined here:
https://github.com/peter-sarazin/books-db

The project was created using the Spring Initializer with the following config:

- Project: Gradle
- Language: Java
- Spring Boot: 2.67
- Packaging: Jar
- Java: 11

Dependencies:
- Spring Web
- Spring Boot DevTools
- MyBatis Framework
- MySQL Driver

### SQL commands to create the configured database user and grant permissions

```sql
create user 'books_user'@'localhost' identified by 'password';
grant all on books.* to 'books_user'@'localhost';
```
### configure myBatis to map snake case database column names to camel case java property names

Place the following in /src/main/resources/application.properties
```
mybatis.configuration.map-underscore-to-camel-case=true
```

### Setting the server port number
The default port that this application runs on is 8081.

You can change the default port number in /src/main/resources/application.properties and you can also override the port number on the commandline at startup.  Example:

```sh
java -jar book-service-0.1.0-SNAPSHOT.jar --server.port=8083
```