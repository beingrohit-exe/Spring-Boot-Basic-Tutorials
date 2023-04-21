package com.tutorial.day1.employee.Service;

import com.tutorial.day1.employee.Entity.Employee;
import com.tutorial.day1.employee.Repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

//    public Employee getById(Integer id){
//        Optional<Employee> employee =  repository.findById(id);
//        if (employee.isPresent()){
//            return employee.get();
//        }
//        else{
////            Employee employee1 = new Employee();
////            employee1.setId(0);
////            employee1.setName("");
////            return employee1;
//
////            Employee employee1 = new Employee(0, "Rohit", "email", 20, "Blank");
////            return employee1;
//            return new Employee(0, "Blank", "email", 20, "Blank");
//        }
//    }

//    public Employee getById(Integer id){
//        Optional<Employee> employee =  repository.findById(id);
//        return employee.get();
//    }

//    public Employee getById(Integer id){
//        Optional<Employee> employee =  repository.findById(id);
//        return employee.isPresent() //true
//                ? employee.get() //true condition
//                : new Employee(1, "Blank", "Blank", 20, "Null"); //false condition
//    }

//    public Employee getById(Integer id){
//        Optional<Employee> employee =  repository.findById(id);
//        //true
//        //true condition
//        return employee.orElseGet(() -> new Employee(1, "Blank", "Blank", 20, "Null")); //false condition
//    }

//    public Employee getById(Integer id){
//        Optional<Employee> employee =  repository.findById(id);
//        if (employee.isPresent()){
//            return employee.get();
//        }
//        else {
//            Employee employee1 = new Employee(1, "Blank", "Blank", 20, "Null");
//            return employee.orElseGet(()-> employee1);
//        }
//    }

    public Employee getById(Integer id){
//        Employee employee = repository.findById(id).get();
//        RuntimeException noValue = new RuntimeException("No value");
//        repository.findById(id).orElseThrow(()-> noValue);

        Employee employee = repository.findById(id).orElseThrow(() -> new RuntimeException("No Value"));
        return employee;
    }

//    public String delete(Integer id){
//        repository.deleteById(id);
//        return "Deleted Successfully";
//    }

    public String delete(Integer id){
        Employee employee = repository.findById(id).orElseThrow(() -> new RuntimeException("No Value"));
        repository.delete(employee);
        return "Deleted Successfully";
    }

    public Employee update(Employee employee, Integer id){
        Employee employee1 = repository.findById(employee.getId()).orElseThrow(() -> new RuntimeException("Invalid Id"));
//        employee.setId(employee1.getId());
//        employee.setId(id + 1);
        Employee save = repository.save(employee);
        return save;
    }

//    public Employee update(Employee employee, Integer id){
//        Employee employee1 = repository.findById(employee.getId()).orElseThrow(() -> new RuntimeException("Invalid Id"));
////        employee.setId(employee1.getId());
////        employee.setId(id + 1);
//        employee1.setName(employee.getName()!=null ? employee.getName() : employee1.getName());
//        return save;
//    }

    public List<Employee> getAll(){
        List<Employee> allEmployee= repository.findAll();
        return allEmployee;
    }
}
