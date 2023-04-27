package com.springtutorial.listservice.Controller;

import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;

import com.springtutorial.listservice.Modal.Employee;
import com.springtutorial.listservice.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        Employee employee = this.employeeService.getEmployee(id);
        return employee;
    }

    @PostMapping
    public String createEmployee(@RequestBody Employee employee){
        String createEmployee = this.employeeService.createEmployee(employee);
        return createEmployee;
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable Integer id){
        String remove = employeeService.remove(id);
        return remove;
    }

    // @GetMapping
    // public List<Employee> getAll(HttpServletRequest request){
    //     String header = request.getHeader("Authorization");
    //     if(header.equals("rohit")){
    //     System.out.println(header);
    //     return employeeService.getAll();
    //     }
    //     else{
    //         throw new RuntimeException("Unauthorized");
    //     }
    // }

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
}