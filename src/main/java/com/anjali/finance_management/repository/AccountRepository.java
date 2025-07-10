package com.anjali.finance_management.repository;

import com.anjali.finance_management.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    List<Account> findAllByOrderByAccountIdAsc();
}
