package com.springmockito.demospringmockkito.service.impl;

import com.springmockito.demospringmockkito.data.Employee;
import com.springmockito.demospringmockkito.exceptions.EmployeeExistsException;
import com.springmockito.demospringmockkito.exceptions.EmployeeNotFoundException;
import com.springmockito.demospringmockkito.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        return add(newEmployee);

    }
    @Override
    public Employee add(Employee employee) {
        if (employeeList.contains(employee)) {
            throw new EmployeeExistsException();
        }
        employeeList.add(employee);
        return employee;

    }
    @Override
    public Employee remove(String firstName,String lastName) {
        Employee removeEmployee = new Employee(firstName, lastName);
        return remove(removeEmployee);

    }
    @Override
    public Employee remove(Employee employee) {
        if (!employeeList.remove(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;

    }
    @Override
    public Employee find(String firstName,String lastName) {
        return find(firstName,lastName);

    }

    @Override
    public Collection<Employee> getAll() {
        return employeeList;
    }





}
