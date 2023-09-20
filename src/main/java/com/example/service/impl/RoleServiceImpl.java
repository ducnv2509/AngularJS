package com.example.service.impl;

import com.example.dao.RoleDAO;
import com.example.entity.Role;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDAO roleDAO;
    @Override
    public List<Role> getAll() {
        return roleDAO.findAll();
    }
}
