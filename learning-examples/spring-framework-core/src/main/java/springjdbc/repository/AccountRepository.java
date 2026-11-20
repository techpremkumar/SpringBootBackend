
package springjdbc.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    private final JdbcTemplate jdbcTemplate;

    public AccountRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int debit(int accountId, double amount) {
        String sql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        return jdbcTemplate.update(sql, amount, accountId);
    }

    public int credit(int accountId, double amount) {
        String sql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
        return jdbcTemplate.update(sql, amount, accountId);
    }
}
