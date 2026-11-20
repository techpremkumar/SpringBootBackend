package javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PaymentRepository paymentRepository() {
        return new PaymentRepository();
    }

    @Bean
    public PaymentService paymentService() {
        return new PaymentService(paymentRepository());
    }
}