package com.example.oopproject.Employee;

import com.example.oopproject.ManagerPackege.Message;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import javafx.scene.chart.PieChart;

import java.time.LocalDateTime;
import java.util.*;

public abstract class Employee extends User {
    protected int salary;
    protected Set<Message> messages;
    protected DataBase dataBase;

    public Employee(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role);
        this.salary = salary;
        messages = new HashSet<>();
        this.dataBase = dataBase;
    }


    @Override
    public void getView() {
        System.out.print("Welcome to system\nSee messages\nSend Messages\n");
        String option = sc.next();
        if(option.equals("See messages")){
            seeMessages();
        }
        else if(option.equals("Send message")){
            sendMessage();
        }
        else if(option.equals("log out")){
            return;
        }
    }

    public void seeMessages(){
        for(Message message: messages){
            System.out.print(message);
            System.out.print("1: For answer\n2: Delete\n3: Answer later\n");
            int option = sc.nextInt();
            if(option == 1){
                sendMessage(message.getSender());
            }
            else if(option == 2){
                messages.remove(message);
            }
        }
        System.out.print("There are no new messages\n");
        getView();
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
        Message message = new Message(theme, text, this.email, false, LocalDateTime.now());
        dataBase.findEmployeeByEmail(email).addMessage(message);
    }
    public void addMessage(Message message){
        messages.add(message);
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
