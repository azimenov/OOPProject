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
    public void seeMessages(){
        for(Message message: employee.getMessages()){
            System.out.print(message);
            System.out.print("1: For answer\n2: Delete\n3: Answer later\n");
            int option = sc.nextInt();
            if(option == 1){
                sendMessage(message.getSender());
            }
            else if(option == 2){
                employee.getMessages().remove(message);
            }
        }
        System.out.print("There are no new messages\n");
    }
    public void sendMessage(){
        System.out.print("Write email: ");
        String email = sc.next();
        sendMessage(email);
    }
    public void sendMessage(String email){
        System.out.println("Write theme");
        String theme = sc.next();
        System.out.print("Write message: ");
        String text = sc.next();
        Message message = new Message(theme, text, employee.getEmail(), false, LocalDateTime.now());
        repository.findEmployeeByEmail(email).getMessages().add(message);
    }
}
