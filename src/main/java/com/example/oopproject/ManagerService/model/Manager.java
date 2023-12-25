package com.example.oopproject.ManagerService.model;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.model.Message;
import com.example.oopproject.ManagerService.News;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.io.Serializable;
import java.util.List;

public class Manager extends Employee implements Serializable {
	protected List<Message> requests;
	protected News newsManager;

    public Manager(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase);
    }

    @Override
    public String toString() {
        return "Manager{" +
                ", requests=" + requests +
                ", newsManager=" + newsManager +
                '}';
    }
   

}
