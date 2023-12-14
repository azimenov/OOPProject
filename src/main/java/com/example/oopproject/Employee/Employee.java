package com.example.oopproject.Employee;

import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.Role;

import java.util.Map;
import java.util.Vector;

public abstract class Employee extends User {
    protected int salary;
    protected Map<String, String> messages;
    public Employee(String name, String password, Role role){
        super(name, password, role);
    }

    public Employee() {

    }

    @Override
    public void getView() {
        return ;
    }
    public void seeMessages(){
        for (Map.Entry<String, String> entry : messages.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    public void sendMessage(String message, Employee employee){
        messages.put(employee.getEmail(), message);
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
