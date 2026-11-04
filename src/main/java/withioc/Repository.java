package withioc;

import org.springframework.stereotype.Component;

@Component
public class Repository {

    public void save() {
        System.out.println("Data saved successfully");
    }
}