# books-service-springboot-mybatis-mysql
book service using SpringBoot, MyBatis, and MySQL

uses database defined here:
https://github.com/peter-sarazin/books-db

Spring initializer config:

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
