package com.codeclan.example.employeeTracking.repositories;

import com.codeclan.example.employeeTracking.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department, Long> {

}
