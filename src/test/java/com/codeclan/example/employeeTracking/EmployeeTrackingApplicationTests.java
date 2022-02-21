package com.codeclan.example.employeeTracking;

import com.codeclan.example.employeeTracking.models.Employee;
import com.codeclan.example.employeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee joe = new Employee("Joe",30,12345,"joe@ssmail.com");
		employeeRepository.save(joe);
	}

}
