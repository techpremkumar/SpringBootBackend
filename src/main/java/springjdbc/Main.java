package springjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import springjdbc.config.AppConfig;
import springjdbc.repository.ProductRepository;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        JdbcTemplate jdbcTemplate =
                context.getBean(JdbcTemplate.class);

        ProductRepository repository =
                new ProductRepository(jdbcTemplate);

        int rows = repository.saveProduct("Laptop", 55000);

        System.out.println("Rows inserted: " + rows);

        context.close();
    }
}