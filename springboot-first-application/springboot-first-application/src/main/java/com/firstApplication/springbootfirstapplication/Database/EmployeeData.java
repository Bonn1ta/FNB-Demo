package com.firstApplication.springbootfirstapplication.Database;

import com.firstApplication.springbootfirstapplication.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeData {
    static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(1231,"othniel","othniel@gmail.com"));
        list.add(new Employee(1232,"paul","paul@gmail.com"));
        list.add(new Employee(1233,"marry","marry@gmail.com"));
    }

    public static List<Employee> getAllEmployees() {
        return list;
    }

    public Employee getEmployeesByID(int empId) {
        return list.stream().filter(employee -> employee.getEmployeeId(1230 + list.size() + 1)==empId).findAny().orElse(null);
    }

    public void addEmployee(Employee emp){
        emp.setEmployeeId(1230+list.size()+1);
        list.add(emp);
    }
}
