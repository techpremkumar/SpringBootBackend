package springjdbc.repository;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveProduct(String name, double price) {

        String sql = "INSERT INTO products(name, price) VALUES (?, ?)";

        return jdbcTemplate.update(sql, name, price);
    }
}