package com.example.service;

import com.example.entity.Account;

import java.util.List;

public interface AccountService {

    Account findById(String username);

    List<Account> getAdministrators();

    List<Account> findAll();
}
