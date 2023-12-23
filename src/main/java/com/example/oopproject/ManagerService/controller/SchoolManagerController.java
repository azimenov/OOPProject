package com.example.oopproject.ManagerService.controller;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;

public class SchoolManagerController extends ManagerController {

    public SchoolManagerController(EmployeeRepositoryImpl repository) {
        super(repository);
    }

    public SchoolManagerController(EmployeeRepositoryImpl repository, Employee employee) {
        super(repository, employee);
    }

    public SchoolManagerController(StudentRepositoryImpl studentRepository, EmployeeRepositoryImpl repository, Employee employee) {
        super(studentRepository, repository, employee);
    }


}
