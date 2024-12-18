package com.sampleProject.EmployeeRecord.repository;

import com.sampleProject.EmployeeRecord.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
