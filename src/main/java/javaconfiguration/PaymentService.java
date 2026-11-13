package javaconfiguration;

public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public void processPayment() {
        repository.savePayment();
        System.out.println("Payment processed successfully");
    }
}