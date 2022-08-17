package com.firstApplication.springbootfirstapplication.service;

import com.firstApplication.springbootfirstapplication.Database.EmployeeData;
import com.firstApplication.springbootfirstapplication.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeData service;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return (List<Employee>) service.getAllEmployees();
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployeeByID(@PathVariable int empId){
        Employee employee = service.getEmployeesByID(empId);
        return employee;
    }

    @PostMapping("/employees/user")
    public void addEmployee(@RequestBody Employee user){
        service.addEmployee(user);
    }
}
