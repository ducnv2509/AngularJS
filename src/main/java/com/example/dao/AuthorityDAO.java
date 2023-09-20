package com.example.dao;

import com.example.entity.Account;
import com.example.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorityDAO extends JpaRepository<Authority, Integer> {
    @Query("Select distinct  a from Authority  a where  a.account in ?1")
    List<Authority> authoritiesOf(List<Account> accounts);
}
