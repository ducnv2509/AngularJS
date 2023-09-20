package com.example.dao;

import com.example.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountDAO extends JpaRepository<Account, String> {
    @Query("select distinct ar.account  from Authority ar WHERE  ar.role.id in ('DIRE', 'STAF')")
    List<Account> getAdministrators();
}
