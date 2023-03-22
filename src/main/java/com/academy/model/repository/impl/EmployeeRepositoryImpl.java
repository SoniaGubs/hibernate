package com.academy.model.repository.impl;

import com.academy.model.DataSourceManager;
import com.academy.model.entity.Employee;
import com.academy.model.repository.EmployeeRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;


import javax.persistence.Query;

import java.util.List;

public class EmployeeRepositoryImpl extends DefaultRepositoryImpl <Employee, Integer> implements EmployeeRepository {


    public Employee findById(Integer id) {
        Session session = DataSourceManager.getInstance().getSession();
        Query query = session.createQuery("from Employee where id = :id");
        query.setParameter("id", id);

        return (Employee) query.getSingleResult();
    }



    public List<Employee> findAll() {
        Session session = DataSourceManager.getInstance().getSession();

        Query query = session.createQuery("from Employee");

        return query.getResultList();
    }

}
