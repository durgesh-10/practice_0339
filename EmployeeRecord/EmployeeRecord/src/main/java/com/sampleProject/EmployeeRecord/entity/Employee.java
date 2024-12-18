package com.sampleProject.EmployeeRecord.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="EmployeeInfo")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long employeeId;
    private  String EmployeeName;
    private  String email;

    private  boolean isActive;
    private  String createdBy;
    private LocalDateTime createdData;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
