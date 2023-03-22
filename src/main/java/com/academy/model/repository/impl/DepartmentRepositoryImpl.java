package com.academy.model.repository.impl;

import com.academy.model.entity.Department;
import com.academy.model.repository.DepartmentRepository;

import java.util.List;

public class DepartmentRepositoryImpl extends DefaultRepositoryImpl<Department, Integer> implements DepartmentRepository {


    @Override
    public List<Department> findAll() {
        return null;
    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findByAddress(String address) {
        return null;
    }
}
