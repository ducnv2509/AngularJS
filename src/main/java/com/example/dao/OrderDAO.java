package com.example.dao;

import com.example.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order, Long> {
    @Query("select p from Order  p where  p.account.username =?1")
    List<Order> findByUsername(String username);
}
