package initializingbean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Product implements InitializingBean, DisposableBean {

    public Product() {
        System.out.println("1. Constructor executed");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("2. afterPropertiesSet executed");
    }

    public void display() {
        System.out.println("3. Product is ready");
    }

    @Override
    public void destroy() {
        System.out.println("4. Destroy method executed");
    }
}