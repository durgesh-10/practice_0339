package com.sampleProject.EmployeeRecord.repository;

import com.sampleProject.EmployeeRecord.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation,Long> {

}
