package com.tutorial.day1.employee.Controller;

import com.tutorial.day1.employee.Entity.Employee;
import com.tutorial.day1.employee.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

//    @GetMapping
//    public Employee byId(@RequestBody Integer id){
//        Employee byId = employeeService.getById(id);
//        return byId;
//    }

    //localhost:8080/employee/{id}
    @GetMapping("/{userId}")
    public Employee byId(@PathVariable("userId") Integer id){
        Employee byId = employeeService.getById(id);
        return byId;
    }

//    @GetMapping
//    public Employee byId(@RequestParam(name = "id", defaultValue = "1", required = false) Integer id){
//        Employee byId = employeeService.getById(id);
//        return byId;
//    }

//    @GetMapping
//    public Employee byId(@RequestParam(name = "id") Integer id){
//        Employee byId = employeeService.getById(id);
//        return byId;
//    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
//        String delete = employeeService.delete(id);
//        String data = employeeService.delete(2);
//        Integer data = employeeService.delete(2);
        return employeeService.delete(id);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Integer id, @RequestBody Employee employee){
//        String delete = employeeService.delete(id);
        return employeeService.update(employee, id);
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

}
