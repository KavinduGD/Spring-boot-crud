package com.springcrud.repository;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springcrud.model.Employee;

@Repository
public interface EmployeeReposirory extends MongoRepository<Employee,ObjectId> {

        public List<Employee> findByRole(String role);

        public List<Employee> findByName(String name); 

    
}
