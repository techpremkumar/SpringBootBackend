package springjdbc.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import springjdbc.model.Product;

public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveProduct(String name, double price) {
        String sql = "INSERT INTO products(name, price) VALUES (?, ?)";
        return jdbcTemplate.update(sql, name, price);
    }

    public Product getProductById(int id) {
        String sql = "SELECT * FROM products WHERE id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                (rs, rowNum) -> new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price")
                ),
                id
        );
    }
}