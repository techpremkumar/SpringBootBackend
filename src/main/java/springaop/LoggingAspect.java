package springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* springaop.PaymentService.makePayment(..))")
    public void logBeforePayment() {
        System.out.println("Logging: Payment method started");
    }
}