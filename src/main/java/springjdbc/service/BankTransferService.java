
package springjdbc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springjdbc.repository.AccountRepository;

@Service
public class BankTransferService {

    private final AccountRepository accountRepository;

    public BankTransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(int fromId, int toId, double amount) {

        accountRepository.debit(fromId, amount);

        System.out.println("Amount debited: " + amount);

        accountRepository.credit(toId, amount);

        System.out.println("Amount credited: " + amount);
    }
}
