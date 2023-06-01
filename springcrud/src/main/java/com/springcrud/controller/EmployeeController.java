package com.springcrud.controller;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.springcrud.model.Employee;
import com.springcrud.service.EmployeeService;


@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

  
    @GetMapping
    public List<Employee> getAllEmployees(){
        return  employeeService.findAll();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/role/{role}")
    public List<Employee> getEmployeeByRole(@PathVariable String role){
        return employeeService.findByRole(role);
    }

    @GetMapping("/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        return employeeService.findByName(name);
    }

    @PatchMapping("/{id}")
    public Employee updateEmployee(@PathVariable ObjectId id,@RequestBody Employee employee){
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable ObjectId id){
        employeeService.deleteEmployee(id);
    }


}

    

