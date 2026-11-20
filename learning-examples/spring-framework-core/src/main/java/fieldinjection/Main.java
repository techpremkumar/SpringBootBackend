package fieldinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService service = context.getBean(OrderService.class);

        service.processOrder();

        context.close();
    }
}