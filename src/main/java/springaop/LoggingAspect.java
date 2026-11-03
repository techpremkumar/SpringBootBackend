package springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* springaop.PaymentService.makePayment(..))")
    public Object aroundPayment(ProceedingJoinPoint joinPoint)
            throws Throwable {

        System.out.println("Before payment");

        Object result = joinPoint.proceed();

        System.out.println("After payment");

        return result;
    }
}