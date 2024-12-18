package com.sampleProject.EmployeeRecord.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDto {
    private  Long employeeId;

    private  String EmployeeName;
    private  String email;

    private  boolean isActive;
    private  String createdBy;
    private LocalDateTime createdData;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
