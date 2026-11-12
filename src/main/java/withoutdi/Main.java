package withoutdi;

public class Main {

    public static void main(String[] args) {

        OrderRepository repository = new OrderRepository();

        OrderService service = new OrderService(repository);

        service.processOrder();
    }
}