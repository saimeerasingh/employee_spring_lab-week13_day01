package com.codeclan.example.employeeTracking.controllers;

import com.codeclan.example.employeeTracking.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;



}
