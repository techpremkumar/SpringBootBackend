package valueannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("valueannotation")
@PropertySource("classpath:application.properties")
public class AppConfig {
}