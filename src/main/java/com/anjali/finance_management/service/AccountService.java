package com.anjali.finance_management.service;

import com.anjali.finance_management.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getEveryAccount();

    Account getAccount(Long id);

    Account createAccount(Account account);

    Account updateAccount(Long id, Account updatedAccount);

    void deleteAccount(Long id);
}
