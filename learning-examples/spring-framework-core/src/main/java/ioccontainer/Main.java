package ioccontainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Create Spring IoC Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Spring Container Started");

        // Retrieve bean
        ProductService service =
                context.getBean(ProductService.class);

        service.processProduct();

        // Check whether bean exists
        System.out.println(
                "Bean exists: " + context.containsBean("productService")
        );

        // Check singleton scope
        ProductService service2 =
                context.getBean(ProductService.class);

        System.out.println(
                "Same object: " + (service == service2)
        );

        // Close container
        context.close();

        System.out.println("Spring Container Closed");
    }
}