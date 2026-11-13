package xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Product product = context.getBean("product", Product.class);

        product.display();

        context.close();
    }
}