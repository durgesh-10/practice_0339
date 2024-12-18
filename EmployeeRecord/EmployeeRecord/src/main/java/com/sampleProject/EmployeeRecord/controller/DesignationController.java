package com.sampleProject.EmployeeRecord.controller;

import com.sampleProject.EmployeeRecord.dto.DesignationDto;
import com.sampleProject.EmployeeRecord.entity.Designation;
import com.sampleProject.EmployeeRecord.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/dur")
public class DesignationController {
    @Autowired
    DesignationService designationService;

    @PostMapping("/designantion/addData")
    public ResponseEntity<Designation>addData(@RequestBody DesignationDto designationDto){
        return new ResponseEntity<>(designationService.addData(designationDto),CREATED);
    }
}
