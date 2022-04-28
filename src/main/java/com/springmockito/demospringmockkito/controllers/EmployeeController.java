package com.springmockito.demospringmockkito.controllers;

import com.springmockito.demospringmockkito.data.Employee;
import com.springmockito.demospringmockkito.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName) {
        Employee result = employeeService.add(firstName, lastName);
        return generateMessage(result, "Added");

    }

    @GetMapping("/remove")
    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
        Employee result = employeeService.remove(firstName, lastName);
        return generateMessage(result, "Removed");

    }

    @GetMapping("/find")
    public String find(@RequestParam String firstName, @RequestParam String lastName) {
        String result = String.valueOf(employeeService.find(firstName, lastName));//???
        return result;
    }

    @GetMapping("/all")
    public Collection<Employee> all() {
        return employeeService.getAll();
    }

    public String generateMessage(Employee employee, String status) {
        return String.format("Employee %s %s %s.",
                employee.getFirstName(),
                employee.getLastName(),
                status);

    }

}
