package com.transaction.management.Transaction_Management_App;

import com.transaction.management.Transaction_Management_App.Entities.Account;
import com.transaction.management.Transaction_Management_App.Repositories.AccountRepository;
import com.transaction.management.Transaction_Management_App.Repositories.TransactionRepository;
import com.transaction.management.Transaction_Management_App.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionManagementAppApplication  implements CommandLineRunner {
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	private TransactionService transactionService;

	public static void main(String[] args) {
		SpringApplication.run(TransactionManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Account account1=new Account();
		account1.setName("Manoj Khanavalkar");
		account1.setDeposit(1000000);
		accountRepository.save(account1);

		Account account2=new Account();
		account2.setName("Disha Khanavalkar");
		account2.setDeposit(500000);
		accountRepository.save(account2);

		int id1=account1.getAccountNo();
		int id2=account2.getAccountNo();
		transactionService.TransferMoney(id1,id2,175000);

	}
}
