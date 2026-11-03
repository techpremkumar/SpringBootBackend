package springjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springjdbc.config.AppConfig;
import springjdbc.service.BankTransferService;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        try {
            BankTransferService service =
                    context.getBean(BankTransferService.class);

            service.transferMoney(101, 102, 2000);

            System.out.println("Transfer completed successfully!");

        } finally {
            context.close();
        }
    }
}