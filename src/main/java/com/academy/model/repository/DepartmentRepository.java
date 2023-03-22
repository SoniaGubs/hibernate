package com.academy.model.repository;

import com.academy.model.entity.Department;

import java.util.List;

public interface DepartmentRepository extends DefaultRepository <Department, Integer>{

    List<Department> findByAddress(String address);
}
