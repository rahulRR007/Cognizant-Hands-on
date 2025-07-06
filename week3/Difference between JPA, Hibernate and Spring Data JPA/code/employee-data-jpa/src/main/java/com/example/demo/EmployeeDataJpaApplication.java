package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@SpringBootApplication
public class EmployeeDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeeDataJpaApplication.class, args);

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setDepartment("Finance");
        emp.setSalary(70000.0);

        employeeService.addEmployee(emp);

        System.out.println("Employee saved using Spring Data JPA.");
    }
}
