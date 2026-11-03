package springaop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* springaop.PaymentService.makePayment(..))")
    public void beforePayment() {
        System.out.println("Before: Payment started");
    }

    @After("execution(* springaop.PaymentService.makePayment(..))")
    public void afterPayment() {
        System.out.println("After: Payment method completed");
    }
}