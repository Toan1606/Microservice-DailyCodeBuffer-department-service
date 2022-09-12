package com.eric.india.Spring.Boot.H2.Database.controller;

import com.eric.india.Spring.Boot.H2.Database.model.Department;
import com.eric.india.Spring.Boot.H2.Database.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/departments")
@AllArgsConstructor
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }
}
