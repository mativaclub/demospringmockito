package com.springmockito.demospringmockkito.service;

import com.springmockito.demospringmockkito.controllers.EmployeeController;
import com.springmockito.demospringmockkito.data.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName);

    Employee add(Employee employee);
    Employee remove(String firstName, String lastName);

    Employee remove(Employee employee);
    Employee find(String firstName, String lastName);

    Collection<Employee> getAll();
}
