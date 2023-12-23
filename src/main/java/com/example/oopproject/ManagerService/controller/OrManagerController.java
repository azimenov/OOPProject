package com.example.oopproject.ManagerService.controller;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;

public class OrManagerController extends ManagerController{
    public OrManagerController(EmployeeRepositoryImpl repository) {
        super(repository);
    }

    public OrManagerController(EmployeeRepositoryImpl repository, Employee employee) {
        super(repository, employee);
    }

    public OrManagerController(StudentRepositoryImpl studentRepository, EmployeeRepositoryImpl repository, Employee employee) {
        super(studentRepository, repository, employee);
    }
}
