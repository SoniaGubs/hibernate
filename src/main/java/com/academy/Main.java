package com.academy;

import com.academy.model.entity.Employee;
import com.academy.model.repository.EmployeeRepository;
import com.academy.model.repository.impl.EmployeeRepositoryImpl;

public class Main {
    public static void main(String[] args) {

        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        Employee employee = employeeRepository.findById(1);

        employeeRepository.findAll();

        var newEmployee = Employee.builder()
                .name("New")
                .surname("Ivan")
                .salary(1400)
                .build();

        employeeRepository.save(newEmployee);
    }
}
