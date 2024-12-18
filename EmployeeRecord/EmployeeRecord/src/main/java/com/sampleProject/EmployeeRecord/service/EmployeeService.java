package com.sampleProject.EmployeeRecord.service;


import com.sampleProject.EmployeeRecord.dto.EmployeeDto;
import com.sampleProject.EmployeeRecord.entity.Employee;
import com.sampleProject.EmployeeRecord.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addData(EmployeeDto employeeDto) {

        Employee emp = new Employee();

        emp.setEmployeeName(employeeDto.getEmployeeName());
        emp.setEmail(employeeDto.getEmail());

        emp.setActive(true);
        emp.setCreatedBy(employeeDto.getCreatedBy());
        emp.setCreatedData(employeeDto.getCreatedData());
        emp.setUpdatedBy(employeeDto.getUpdatedBy());
        emp.setUpdatedDate(employeeDto.getUpdatedDate());
        return employeeRepository.save(emp);

    }

    public Employee updateData(Long id, EmployeeDto employeeDto) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee emp = optionalEmployee.get();
            emp.setEmployeeName(employeeDto.getEmployeeName());
            emp.setEmail(employeeDto.getEmail());
            emp.setActive(employeeDto.isActive());
            emp.setUpdatedBy(employeeDto.getUpdatedBy());
            emp.setUpdatedDate(employeeDto.getUpdatedDate());
            return employeeRepository.save(emp);
        } else {
            throw new RuntimeException("Employee not found with ID: " + id);
        }
    }

    public void deleteData(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        } else {
            throw new RuntimeException("Employee not found with ID: " + id);
        }
    }
}
