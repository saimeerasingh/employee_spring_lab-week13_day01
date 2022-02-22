package com.codeclan.example.employeeTracking.repositories;

import com.codeclan.example.employeeTracking.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Long> {
}
