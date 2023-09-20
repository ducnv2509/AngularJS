package com.example.service.impl;

import com.example.dao.AccountDAO;
import com.example.dao.AuthorityDAO;
import com.example.entity.Account;
import com.example.entity.Authority;
import com.example.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityDAO authorityDAO;

    @Autowired
    AccountDAO accountDAO;

    @Override
    public List<Authority> findAuthoritiesOfAdministrators() {
        List<Account> accounts = accountDAO.getAdministrators();
        return authorityDAO.authoritiesOf(accounts);
    }

    @Override
    public List<Authority> findAll() {
        return authorityDAO.findAll();
    }

    @Override
    public Authority create(Authority auth) {
        return authorityDAO.save(auth);
    }

    @Override
    public void delete(Integer id) {
        authorityDAO.deleteById(id);
    }
}
