package com.codeclan.example.employeeTracking;

import com.codeclan.example.employeeTracking.models.Department;
import com.codeclan.example.employeeTracking.models.Employee;
import com.codeclan.example.employeeTracking.repositories.DepartmentRepository;
import com.codeclan.example.employeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createEmployee(){
//		Employee joe = new Employee("Joe",30,12345,"joe@ssmail.com");
//		employeeRepository.save(joe);
//	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("IT department");
		departmentRepository.save(department);

		Employee employee = new Employee("Joe",30,12345,"joe@gmail.com",department);
		employeeRepository.save(employee);


	}


}
