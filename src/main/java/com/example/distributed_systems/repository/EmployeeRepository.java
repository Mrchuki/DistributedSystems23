package com.example.distributed_systems.repository;

import com.example.distributed_systems.model.Employee;
//import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

@org.springframework.stereotype.Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}