package com.tutorial.day1.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.day1.employee.Entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Integer> {
    
}
