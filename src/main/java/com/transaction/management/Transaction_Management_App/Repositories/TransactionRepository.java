package com.transaction.management.Transaction_Management_App.Repositories;

import com.transaction.management.Transaction_Management_App.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
