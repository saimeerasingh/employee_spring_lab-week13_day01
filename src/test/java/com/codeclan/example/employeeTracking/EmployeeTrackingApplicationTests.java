package com.codeclan.example.employeeTracking;

import com.codeclan.example.employeeTracking.models.Department;
import com.codeclan.example.employeeTracking.models.Employee;
import com.codeclan.example.employeeTracking.models.Project;
import com.codeclan.example.employeeTracking.repositories.DepartmentRepository;
import com.codeclan.example.employeeTracking.repositories.EmployeeRepository;
import com.codeclan.example.employeeTracking.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

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

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("IT department");
		departmentRepository.save(department);

		Employee employee = new Employee("Joe",30,12345,"joe@gmail.com",department);
		employeeRepository.save(employee);

		Project project = new Project("Java App",10);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);

	}


}
