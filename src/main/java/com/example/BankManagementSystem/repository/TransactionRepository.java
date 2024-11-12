
package com.example.BankManagementSystem.repository;


import com.example.BankManagementSystem.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {

  
    List<Transaction> findByAccountId(Long accountId);

    
    List<Transaction> findByType(String type);

 
    List<Transaction> findByAccountIdOrderByTransactionDateDesc(Long accountId);
    
    List<Transaction> findByAccountIdOrderByIdDesc(Long accountId);
    

}
