package valueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Value("${app.name}")
    private String applicationName;

    @Value("${app.version}")
    private String version;

    public void display() {
        System.out.println("Application: " + applicationName);
        System.out.println("Version: " + version);
    }
}