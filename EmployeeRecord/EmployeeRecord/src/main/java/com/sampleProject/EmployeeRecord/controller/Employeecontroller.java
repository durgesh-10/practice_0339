package com.sampleProject.EmployeeRecord.controller;

import com.sampleProject.EmployeeRecord.dto.EmployeeDto;
import com.sampleProject.EmployeeRecord.entity.Employee;
import com.sampleProject.EmployeeRecord.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/dur")
public class Employeecontroller {

  @Autowired
  EmployeeService employeeService;

  @PostMapping("/addData")
  public ResponseEntity<Employee>addData(@RequestBody EmployeeDto employeeDto){
    return  new ResponseEntity<>(employeeService.addData(employeeDto),CREATED);
  }
}
