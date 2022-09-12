package com.eric.india.Spring.Boot.H2.Database.service;

import com.eric.india.Spring.Boot.H2.Database.model.Department;
import com.eric.india.Spring.Boot.H2.Database.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentService {

    private final DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
