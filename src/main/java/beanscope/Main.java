package beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("---- SINGLETON ----");

        Product s1 = context.getBean("singletonProduct", Product.class);
        Product s2 = context.getBean("singletonProduct", Product.class);

        System.out.println("Same object: " + (s1 == s2));

        System.out.println("---- PROTOTYPE ----");

        Product p1 = context.getBean("prototypeProduct", Product.class);
        Product p2 = context.getBean("prototypeProduct", Product.class);

        System.out.println("Same object: " + (p1 == p2));

        context.close();
    }
}