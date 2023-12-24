package com.example.oopproject.EmployeeService.controller;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.EmployeeService.Message;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeController {
    protected EmployeeRepositoryImpl repository;
    protected Employee employee;
    protected Scanner sc;

    public EmployeeController(EmployeeRepositoryImpl repository){
        this.repository = repository;
    }
    public EmployeeController(EmployeeRepositoryImpl repository, Employee employee){
        this.repository = repository;
        this.employee = employee;
        sc = new Scanner(System.in);

    }
    public int getEmployeeSalary(Employee employee) {
        return employee.getSalary();
    }

    public Set<Message> getEmployeeMessages(Employee employee) {
        return employee.getMessages();
    }

    public void updateEmployeeSalary(Employee employee, int newSalary) {
        employee.setSalary(newSalary);
          }
    public void sendMessage(Employee employee) {
        employeeController.sendMessage();
    }

    public void sendMessage(Employee employee, String email) {
        employeeController.sendMessage(email);
    }
}
