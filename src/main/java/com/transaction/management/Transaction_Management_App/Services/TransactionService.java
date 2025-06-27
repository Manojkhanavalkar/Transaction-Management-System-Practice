package com.transaction.management.Transaction_Management_App.Services;

import com.transaction.management.Transaction_Management_App.Entities.Account;
import com.transaction.management.Transaction_Management_App.Entities.Transaction;
import com.transaction.management.Transaction_Management_App.Entities.TransactionType;
import com.transaction.management.Transaction_Management_App.Repositories.AccountRepository;
import com.transaction.management.Transaction_Management_App.Repositories.TransactionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransactionService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;
    @Transactional
    public void TransferMoney(int fromId,int toId,int amount){
        Account fromAccount=accountRepository.findById(fromId).orElseThrow(()->new RuntimeException("Sender account not found"));
        Account toAccount=accountRepository.findById(toId).orElseThrow(()->new RuntimeException("Reciever's account not found"));

        if(fromAccount.getDeposit() < amount){
            throw new RuntimeException("insufficient balance");
        }

        fromAccount.setDeposit(fromAccount.getDeposit() - amount);

        toAccount.setDeposit(toAccount.getDeposit() + amount);

        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);

        Transaction credit=new Transaction();

        credit.setAccount(toAccount);
        credit.setCreatedDate(new Date());
        credit.setAmount(amount);
        credit.setTransactionType(TransactionType.Debit);

        transactionRepository.save(credit);

        Transaction debit=new Transaction();

        debit.setAccount(toAccount);
        debit.setCreatedDate(new Date());
        debit.setAmount(amount);
        debit.setTransactionType(TransactionType.Credit);

        transactionRepository.save(debit);

        System.out.println("Transferred ₹" + amount + " from Acc " + fromId + " to Acc " + toId);
    }

}
