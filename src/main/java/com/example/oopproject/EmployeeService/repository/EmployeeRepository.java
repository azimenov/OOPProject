package com.example.oopproject.EmployeeService.repository;

import com.example.oopproject.EmployeeService.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    public Employee findEmployeeByEmail(String email);
    public Employee findEmployeeById(String id);
    public void addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
