package com.sampleProject.EmployeeRecord.repository;

import com.sampleProject.EmployeeRecord.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
