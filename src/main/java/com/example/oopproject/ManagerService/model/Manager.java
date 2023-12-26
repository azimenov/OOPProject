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

/**
 * Manager class represents a Manager, inheriting from the Employee class and implementing Serializable.
 */
public class Manager extends Employee implements Serializable {
    // List of messages associated with requests handled by the manager
    protected List<Message> requests;

    // News instance managed by the manager
    protected News newsManager;

    /**
     * Constructor to initialize a Manager object.
     * @param id The ID of the manager.
     * @param password The password of the manager.
     * @param firstName The first name of the manager.
     * @param lastName The last name of the manager.
     * @param phoneNumber The phone number of the manager.
     * @param gender The gender of the manager.
     * @param familyStatus The family status of the manager.
     * @param role The role of the manager.
     * @param salary The salary of the manager.
     */
    public Manager(String id, String password, String firstName, String lastName, String phoneNumber,
                   Gender gender, FamilyStatus familyStatus, Role role, int salary) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary);
    }

    /**
     * Overrides the toString method to provide a string representation of the Manager object.
     * @return A string representation of the Manager object.
     */
    @Override
    public String toString() {
        return "Manager{" +
                "id='" + getId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", gender=" + getGender() +
                ", familyStatus=" + getFamilyStatus() +
                ", role=" + getRole() +
                ", salary=" + getSalary() +
                ", requests=" + requests +
                ", newsManager=" + newsManager +
                '}';
    }
}
