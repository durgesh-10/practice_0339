package com.sampleProject.EmployeeRecord.controller;

import com.sampleProject.EmployeeRecord.dto.DepartmentDto;
import com.sampleProject.EmployeeRecord.entity.Department;
import com.sampleProject.EmployeeRecord.repository.DepartmentRepository;
import com.sampleProject.EmployeeRecord.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/chi")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/department/addData")

    public ResponseEntity<Department>addData(@RequestBody DepartmentDto departmentDto)
    {
        return  new ResponseEntity<>(departmentService.addData(departmentDto),CREATED);
    }
}
