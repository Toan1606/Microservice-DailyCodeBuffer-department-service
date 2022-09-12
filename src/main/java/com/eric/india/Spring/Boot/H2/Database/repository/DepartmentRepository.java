package com.eric.india.Spring.Boot.H2.Database.repository;

import com.eric.india.Spring.Boot.H2.Database.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
