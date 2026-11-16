package constructorinjection;

import org.springframework.stereotype.Service;

@Service
public class OrderService 1{

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void processOrder() {

        orderRepository.getOrder();

        System.out.println("Order processed successfully");
    }
}
