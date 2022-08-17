package com.firstApplication.springbootfirstapplication.service;

import com.firstApplication.springbootfirstapplication.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

class EmployeeControllerTest {

    @Test
    void getAllEmployeesTest() {
        EmployeeController controller = new EmployeeController();

        List<Employee> employeeListTest = new ArrayList<>();
        employeeListTest.add(new Employee(1231,"othniel","othniel@gmail.com"));
        employeeListTest.add(new Employee(1232,"paul","paul@gmail.com"));
        employeeListTest.add(new Employee(1233,"marry","marry@gmail.com"));

        List<Employee> employeeList = new ArrayList<>();
        employeeList = controller.getAllEmployees();

        for (int i = 0; i < employeeList.size(); i++) {
            assertEquals(employeeListTest.get(i).getName(), employeeList.get(i).getName());
            assertEquals(employeeListTest.get(i).getEmail(), employeeList.get(i).getEmail());
        }
    }

    @Test
    void getEmployeeByIDTest() {
        EmployeeController controller = new EmployeeController();
        Employee employee = new Employee(1231,"othniel","othniel@gmail.com");
        assertEquals(employee.getName(), controller.getEmployeeByID(1231).getName());
        assertEquals(employee.getEmail(), controller.getEmployeeByID(1231).getEmail());
    }

    @Test
    void addEmployeeTest() {

    }
}