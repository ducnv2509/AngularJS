package com.example.dao;

import com.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductDAO extends JpaRepository<Product, Integer> {

    @Query("select p from Product  p where p.category.id=?1")
    List<Product> findByCategoryId(String cid);

}
