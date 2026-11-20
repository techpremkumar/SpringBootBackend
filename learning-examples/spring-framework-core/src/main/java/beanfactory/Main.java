package beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.BeanFactory;
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BeanFactory factory = context;

        System.out.println("Container initialized");

        Product product = factory.getBean(Product.class);

        product.display();

        context.close();
    }
}