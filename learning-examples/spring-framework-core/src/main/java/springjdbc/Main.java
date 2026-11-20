
package springjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springjdbc.config.AppConfig;
import springjdbc.service.BankTransferService;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        try {
            // Retrieve Spring service bean
            BankTransferService service =
                    context.getBean(BankTransferService.class);

            // Test transaction rollback
            try {
                service.transferMoney(101, 102, 2000);
            } catch (RuntimeException e) {
                System.out.println(
                        "Transaction rolled back: " + e.getMessage()
                );
            }

        } finally {
            context.close();
        }
    }
}
