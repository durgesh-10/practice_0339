package com.sampleProject.EmployeeRecord.service;


import com.sampleProject.EmployeeRecord.dto.EmployeeDto;
import com.sampleProject.EmployeeRecord.entity.Employee;
import com.sampleProject.EmployeeRecord.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addData(EmployeeDto employeeDto) {

        Employee emp = new Employee();

        emp.setEmployeeName(employeeDto.getEmployeeName());
        emp.setEmail(employeeDto.getEmail());

        emp.setActive(employeeDto.isActive());
        emp.setCreatedBy(employeeDto.getCreatedBy());
        emp.setCreatedData(employeeDto.getCreatedData());
        emp.setUpdatedBy(employeeDto.getUpdatedBy());
        emp.setUpdatedDate(employeeDto.getUpdatedDate());
        return employeeRepository.save(emp);

    }
}
