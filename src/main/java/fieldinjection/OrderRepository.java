package fieldinjection;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public void getOrder() {
        System.out.println("Order retrieved from database");
    }
}