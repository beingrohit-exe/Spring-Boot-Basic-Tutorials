package com.tutorial.day1.employee.Service;

import com.tutorial.day1.employee.Entity.Employee;
import com.tutorial.day1.employee.Repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author - rohit
 * @project - employee
 * @package - com.tutorial.day1.employee.Service
 * @created_on - April 18-2023
 */

@Service
public class employeeService {

    @Autowired
    private employeeRepository repository;

    /**
     *
     * CRUD
     */
    public Employee createEmployee(Employee employee){
        //System.err.println("Entry in Service : " + employee.getId());
        Employee save = repository.save(employee);
        //System.err.println("After Database || Return from Service : " + save.getId());
        return save;
    }
}
