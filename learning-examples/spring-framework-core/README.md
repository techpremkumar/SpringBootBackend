# Spring Framework Core - Learning Examples

This directory preserves the standalone Spring Framework exercises that were previously mixed into the repository root. They are learning examples, not part of the Spring Boot product API at the repository root.

## Topics

| Package | Concepts |
|---|---|
| `withoutdi`, `withdi` | Manual object creation vs dependency injection |
| `withoutioc`, `withioc`, `ioccontainer` | Inversion of Control and container-managed objects |
| `beanfactory`, `beanscope`, `initializingbean` | BeanFactory, bean scopes and lifecycle |
| `constructorinjection`, `setterinjection`, `fieldinjection` | Dependency injection styles |
| `javaconfiguration`, `xmlconfiguration`, `valueannotation` | Java/XML configuration and property injection |
| `springaop` | Aspect-oriented programming |
| `springjdbc` | JdbcTemplate and transaction management |
| `springmvc` | Basic Spring MVC controller |

## Build

From this directory:

```bash
mvn clean compile
```

You need JDK 21 and Maven. The JDBC examples additionally require a local MySQL database and the environment variables below.

## JDBC example configuration

The JDBC configuration reads these variables:

- `SPRING_JDBC_URL` (default: `jdbc:mysql://localhost:3306/spring_jdbc_db`)
- `SPRING_JDBC_USERNAME` (default: `root`)
- `SPRING_JDBC_PASSWORD` (default: empty)

Set them in your shell before running a JDBC example. Do not commit actual credentials.

## Run an example

After compiling, run a class from this module's directory using the dependency classpath. For example, the IoC examples have their own `Main` classes. Because each topic is a separate package and may have a different configuration, run only the example you are studying.

The Spring MVC package contains a controller example; it is not a separately configured web application.
