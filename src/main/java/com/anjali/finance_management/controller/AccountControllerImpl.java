package com.anjali.finance_management.controller;

import com.anjali.finance_management.model.Account;
import com.anjali.finance_management.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountControllerImpl implements AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountControllerImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public List<Account> getEveryAccount() {
        return this.accountService.getEveryAccount();
    }

    @Override
    public Account getAccount(Long id) {
        return this.accountService.getAccount(id);
    }

    @Override
    public Account createAccount(Account account) {
        return this.accountService.createAccount(account);
    }

    @Override
    public Account updateAccount(Long id, Account account) {
        return this.accountService.updateAccount(id, account);
    }

    @Override
    public void deleteAccount(Long id) {
        this.accountService.deleteAccount(id);
    }
}

