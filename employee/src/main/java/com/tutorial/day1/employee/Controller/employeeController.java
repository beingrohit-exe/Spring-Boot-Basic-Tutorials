package com.tutorial.day1.employee.Controller;

import com.tutorial.day1.employee.Entity.Employee;
import com.tutorial.day1.employee.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //http://localhost:8080/employee/create
    //@RequestMapping(method = RequestMethod.POST, value = "/create")
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee){
        System.err.println("Entry to Controller : " + employee.getId());
        Employee data = employeeService.createEmployee(employee);
        //System.err.println("Return from Controller : " + data.getId());
        return data;
    }


}
