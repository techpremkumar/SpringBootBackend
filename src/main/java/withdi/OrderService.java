package withdi;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void processOrder() {
        orderRepository.getOrder();

        System.out.println("Order processed successfully");
    }
}