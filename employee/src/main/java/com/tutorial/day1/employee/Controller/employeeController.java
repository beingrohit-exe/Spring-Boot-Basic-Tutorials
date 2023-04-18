package com.tutorial.day1.employee.Controller;

import com.tutorial.day1.employee.Entity.Employee;
import com.tutorial.day1.employee.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - rohit
 * @project - employee
 * @package - com.tutorial.day1.employee.Controller
 * @created_on - April 18-2023
 */

@RestController
@RequestMapping("/employee")
public class employeeController {

    @Autowired
    private employeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        System.out.println(employee.getName());
        Employee data = employeeService.createEmployee(employee);
        return data;
    }
}
