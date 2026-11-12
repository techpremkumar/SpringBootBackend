package withioc;

import org.springframework.stereotype.Component;

@Component
public class Service {

    public void execute() {
        System.out.println("Service executed successfully");
    }
}