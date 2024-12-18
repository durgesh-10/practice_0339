package com.sampleProject.EmployeeRecord.service;

import com.sampleProject.EmployeeRecord.dto.DesignationDto;
import com.sampleProject.EmployeeRecord.entity.Designation;
import com.sampleProject.EmployeeRecord.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignationService {

    @Autowired
    DesignationRepository designationRepository;

    public Designation addData(DesignationDto designationDto)
    {
        Designation designation = new Designation();

        designation.setDesignationId(designation.getDesignationId());
        designation.setDesignationName(designation.getDesignationName());

        designation.setActive(true);
        designation.setCreatedBy(designation.getCreatedBy());
        designation.setCreatedDate(designation.getCreatedDate());
        designation.setUpdatedBy(designation.getUpdatedBy());
        designation.setUpdatedDate(designation.getUpdatedDate());
        return designationRepository.save(designation);
    }
}
