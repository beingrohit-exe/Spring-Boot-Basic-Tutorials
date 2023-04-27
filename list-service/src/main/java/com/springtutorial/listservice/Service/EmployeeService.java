package com.springtutorial.listservice.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.annotations.SourceType;
import org.springframework.core.annotation.MergedAnnotation.Adapt;
import org.springframework.stereotype.Service;

import com.springtutorial.listservice.Modal.Employee;

@Service
public class EmployeeService {
    
    List<Employee> list = new ArrayList<>();

    public EmployeeService(){
        // Employee e1 = new Employee();
        // e1.setId(1);
        // e1.setFirstname("Rohit");
        // e1.setLastname("Parihar");
        // e1.setCity("City");
        // list.add(e1);

        // Employee e1 = new Employee(1, "Rohit", "Parihar", "Noida");
        // Employee e2 = new Employee(2, "Rohit", "Parihar", "Noida");
        // Employee e3 = new Employee(3, "Rohit", "Parihar", "Noida");
        // Employee e4 = new Employee(4, "Rohit", "Parihar", "Noida");
        // list.add(e1);
        // list.add(e2);
        // list.add(e3);
        // list.add(e4);

        list.add(new Employee(1, "Rohit", "Parihar", "Noida"));
        list.add(new Employee(2, "Rishab", "Sharma", "Pune"));
        list.add(new Employee(3, "Sachin", "", "Noida"));
        list.add(new Employee(4, "Rakesh", "Shaw", "Ranchi"));
    }


    public Employee getEmployee(Integer id){
        //== or equals
        Employee e1 = list.stream().filter(employee-> id.equals(employee.getId())).findFirst().orElseThrow(()-> new RuntimeException("Emmployee not preset with given Id"));
        return e1;
    }

    public String createEmployee(Employee employee){
        List<Boolean> collect = list.stream().map(e-> e.getId().equals(employee.getId())).collect(Collectors.toList());
        System.out.println(collect);
        Boolean isValid = collect.contains(true);
        if(!isValid){
            list.add(employee);
        }
        else{
            throw new RuntimeException("Id Present");
        }
        return "Added Successfully";
    }

    public String remove(Integer id){
        // list.stream().forEach(e-> {
        //     if(e.getId().equals(id)) list.remove(e);
        //     else throw new RuntimeException("Not Present");
        // });

        // list.forEach(e-> {
        //     if(e.getId().equals(id)) list.remove(e);
        //     else throw new RuntimeException("Not Present");
        // });

        Employee employee = list
                                .stream()
                                .filter(e-> e.getId().equals(id))
                                .findFirst()
                                .orElseThrow(()-> new RuntimeException("Not Present"));
        // list.remove(employee.getId()-1);
        list.remove(employee);
        return "Removed Successfully";
    }

    public List<Employee> getAll(){
        return list;
    }
}
