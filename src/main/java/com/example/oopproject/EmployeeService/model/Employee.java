package com.example.oopproject.EmployeeService.model;

import com.example.oopproject.EmployeeService.view.Message;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

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

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }
    public void addMessgae(Message message){messages.add(message);}
}
