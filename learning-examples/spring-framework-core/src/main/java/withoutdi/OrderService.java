package withoutdi;

public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void processOrder() {
        orderRepository.getOrder();

        System.out.println("Order processed successfully");
    }
}