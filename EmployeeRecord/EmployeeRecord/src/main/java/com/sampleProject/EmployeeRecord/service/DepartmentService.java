package com.sampleProject.EmployeeRecord.service;

import com.sampleProject.EmployeeRecord.dto.DepartmentDto;
import com.sampleProject.EmployeeRecord.entity.Department;
import com.sampleProject.EmployeeRecord.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department addData(DepartmentDto departmentDto){

        Department dep = new Department();

        dep.setDeptId(dep.getDeptId());
        dep.setDeptName(dep.getDeptName());

        dep.setActive(true);
        dep.setCreatedBy(dep.getCreatedBy());
        dep.setCreatedDate(dep.getCreatedDate());
        dep.setUpdatedBy(dep.getUpdatedBy());
        dep.setUpdatedDate(dep.getUpdatedDate());
        return departmentRepository.save(dep);
    }


}
