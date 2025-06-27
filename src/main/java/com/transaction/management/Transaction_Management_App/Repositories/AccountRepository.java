package com.transaction.management.Transaction_Management_App.Repositories;

import com.transaction.management.Transaction_Management_App.Entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
