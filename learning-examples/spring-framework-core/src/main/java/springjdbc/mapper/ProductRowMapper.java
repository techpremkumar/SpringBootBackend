package springjdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import springjdbc.model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum)
            throws SQLException {

        return new Product(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("price")
        );
    }
}