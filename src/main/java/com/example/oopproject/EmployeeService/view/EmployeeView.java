package com.example.oopproject.EmployeeService.view;

import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.model.Employee;

import java.util.Scanner;

public class EmployeeView {
    protected EmployeeController employeeController;
    protected Employee employee;

    public EmployeeView(EmployeeController employeeController, Employee employee) {
        this.employeeController = employeeController;
        this.employee = employee;
    }

    public EmployeeView() {

    }

    public void getView(){
        System.out.println("Welcome to system\n1.See messages\n2.See all messages\n3.Send Messages");
        Scanner sc = new Scanner(System.in);

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
        //Напишите
    }
    public void seeMessages(){
        for(Message message: employeeController.getUnreadMessages(employee)){
            System.out.println(message);
        }
    }
    public void seeUnreadMessages(){
        for(Message message: employeeController.getAllMessages(employee)){
            System.out.println(message);
        }
    }
}
