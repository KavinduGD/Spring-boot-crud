package com.springcrud.service;


import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import com.springcrud.repository.EmployeeReposirory;
import java.util.List;
import com.springcrud.model.Employee;

@Service
public class EmployeeService {

    
    private EmployeeReposirory employeeReposirory;

    public EmployeeService(EmployeeReposirory employeeReposirory) {
        this.employeeReposirory = employeeReposirory;
    }


    public List<Employee> findAll() {
        return employeeReposirory.findAll();
    }


    public Employee addEmployee(Employee employee) {
        return employeeReposirory.save(employee);
    }


    public List<Employee> findByRole(String role) {
        return employeeReposirory.findByRole(role);
    }


    public List<Employee> findByName(String name) {
        return employeeReposirory.findByName(name);
    }


    public Employee updateEmployee(Employee employee) {
        return employeeReposirory.save(employee);
    }


    public void deleteEmployee(ObjectId id) {
        employeeReposirory.deleteById(id);
    }


    
}
