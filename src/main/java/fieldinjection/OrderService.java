package fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void processOrder() {
        orderRepository.getOrder();
        System.out.println("Order processed successfully");
    }
}