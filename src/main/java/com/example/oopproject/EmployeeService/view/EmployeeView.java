package com.example.oopproject.EmployeeService.view;

import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.model.Employee;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeView {
    protected EmployeeController employeeController;
    protected Employee employee;
    protected Scanner sc;
    public EmployeeView(EmployeeController employeeController, Employee employee) {
        this.employeeController = employeeController;
        this.employee = employee;
        sc = new Scanner(System.in);
    }

    public EmployeeView() {

    }

    public void getView(){
        System.out.println("Welcome to system\n1.See messages\n2.See all messages\n3.Send Messages");
        int option = sc.nextInt();

        if(option == 1){
            seeMessages();
        }
        else if(option == 2){
            seeUnreadMessages();
        }
        else if(option == 3){
            sendMessage();
        }
    }
    public void sendMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write email: ");
        String email = sc.next();
        System.out.println("Enter message theme:");
        String theme = sc.next();

        System.out.println("Enter message text:");
        String text = sc.next();

        System.out.println("Enter your email:");
        String sender = sc.next();

        employeeController.sendMessage(new Message(theme, text, sender, false, LocalDateTime.now()), email);
        getView();
    }
    public void seeMessages(){
        for(Message message: employeeController.getUnreadMessages(employee)){
            System.out.println(message);
        }
        getView();
    }
    public void seeUnreadMessages(){
        for(Message message: employeeController.getAllMessages(employee)){
            System.out.println(message);
        }
        getView();
    }
}
