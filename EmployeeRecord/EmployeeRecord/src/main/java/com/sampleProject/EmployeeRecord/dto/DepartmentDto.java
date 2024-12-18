package com.sampleProject.EmployeeRecord.dto;

import java.time.LocalDateTime;

public class DepartmentDto {
    private int  DepartmentId;
    private String DepartmentName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
