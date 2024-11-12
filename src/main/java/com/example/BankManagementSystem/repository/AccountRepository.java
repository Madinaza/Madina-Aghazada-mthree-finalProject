
package com.example.BankManagementSystem.repository;

import com.example.BankManagementSystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

      Optional<Account> findByAccountNumber(String accountNumber);

   

    boolean existsByAccountNumber(String accountNumber);
}

