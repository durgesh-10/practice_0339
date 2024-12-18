package com.sampleProject.EmployeeRecord.controller;

import com.sampleProject.EmployeeRecord.dto.EmployeeDto;
import com.sampleProject.EmployeeRecord.entity.Employee;
import com.sampleProject.EmployeeRecord.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/dur")
public class Employeecontroller {

  @Autowired
  EmployeeService employeeService;

  @PostMapping("/addData")
  public ResponseEntity<Employee>addData(@RequestBody EmployeeDto employeeDto){
    return  new ResponseEntity<>(employeeService.addData(employeeDto),CREATED);
  }
  @PutMapping("/update/{id}")
  public ResponseEntity<Employee> updateData(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) {
    return new ResponseEntity<>(employeeService.updateData(id, employeeDto), OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteData(@PathVariable Long id) {
    employeeService.deleteData(id);
    return new ResponseEntity<>("Employee deleted successfully", OK);
  }
}
