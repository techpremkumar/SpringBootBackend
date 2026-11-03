
package springjdbc.repository;

import springjdbc.mapper.ProductRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import springjdbc.model.Product;

public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // INSERT
    public int saveProduct(String name, double price) {
        String sql = "INSERT INTO products(name, price) VALUES (?, ?)";
        return jdbcTemplate.update(sql, name, price);
    }

    // SELECT
    public Product getProductById(int id) {
        String sql = "SELECT * FROM products WHERE id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new ProductRowMapper(),
                id
        );
    }

    // UPDATE
    public int updateProductPrice(int id, double newPrice) {
        String sql = "UPDATE products SET price = ? WHERE id = ?";
        return jdbcTemplate.update(sql, newPrice, id);
    }
}
