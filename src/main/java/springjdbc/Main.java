package springjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import springjdbc.config.AppConfig;
import springjdbc.model.Product;
import springjdbc.repository.ProductRepository;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        ProductRepository repository = new ProductRepository(jdbcTemplate);

        Product product = repository.getProductById(1);

        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());

        context.close();
    }
}