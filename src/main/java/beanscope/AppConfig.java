package beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton")
    public Product singletonProduct() {
        return new Product();
    }

    @Bean
    @Scope("prototype")
    public Product prototypeProduct() {
        return new Product();
    }
}