package com.example.oopproject.EmployeeService.controller;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.EmployeeService.model.Message;

import java.util.List;

public class EmployeeController {
    protected EmployeeRepositoryImpl employeeRepository;

    public EmployeeController(EmployeeRepositoryImpl repository){
        this.employeeRepository = repository;

    }

    public void updateEmployeeSalary(Employee employee, int newSalary) {
        employee.setSalary(newSalary);
    }

    public void sendMessage(Message message, String email){
        employeeRepository.findEmployeeByEmail(email).addMessage(message);
    }
    public List<Message> getUnreadMessages(Employee employee){
        return employee.getMessages().stream().filter(message -> message.getRead() == false).toList();
    }
    public List<Message> getAllMessages(Employee employee){
        return employee.getMessages().stream().toList();
    }
}
