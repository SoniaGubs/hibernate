package com.academy.model.repository.impl;

import com.academy.model.DataSourceManager;
import com.academy.model.entity.Account;
import com.academy.model.entity.Employee;
import com.academy.model.repository.AccountRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl extends DefaultRepositoryImpl <Account, Integer> implements AccountRepository {


    @Override
    public List<Account> findAll() {
       return null;
    }

    @Override
    public Account findById(Integer id) {
        return null;
    }
}
