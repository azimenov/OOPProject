package com.example.oopproject.Employee;

import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import javafx.scene.chart.PieChart;

import java.util.HashMap;
import java.util.Map;

public abstract class Employee extends User {
    protected int salary;
    protected Map<String, String> messages;
    protected DataBase dataBase;

    public Employee(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role);
        this.salary = salary;
        messages = new HashMap<>();
        this.dataBase = dataBase;
    }


    @Override
    public void getView() {
        System.out.print("Welcome to system\nSee messages\nSend Messages");
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
        for (Map.Entry<String, String> entry : messages.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    public void sendMessage(){
        System.out.print("Write email: ");
        String email = sc.next();
        System.out.print("Write message: ");
        String message = sc.next();
        Employee employee = dataBase.findEmployeeByEmail(email);
        employee.getMessage(this.email, message);
    }
    public void getMessage(String email, String message){
        messages.put(email, message);
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
