package com.example.oopproject.AdminService.view;

import com.example.oopproject.AdminService.controller.AdminController;
import com.example.oopproject.AdminService.model.Admin;

import java.util.Scanner;

public class AdminViewEn {
    private AdminController adminController;
    private Admin admin;

    public void getView(){
        System.out.print("Welcome to system\n 1.Add user\n2. Remove user\n3.Update");

    }

    public void addUser() {    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user ID:");
        this.id = scanner.nextLine();
        System.out.println("Enter user email:");    this.email = scanner.nextLine();
        System.out.println("Enter user password:");
        this.password = scanner.nextLine();
        System.out.println("Enter user first name:");    this.firstName = scanner.nextLine();
        System.out.println("Enter user last name:");
        this.lastName = scanner.nextLine();
        System.out.println("Enter user phone number:");    this.phoneNumber = scanner.nextLine();
        System.out.println("Enter user gender (Male/Female):");
        String genderInput = scanner.nextLine();    this.gender = Gender.valueOf(genderInput.toUpperCase());
        System.out.println("Enter user family status:");
        String familyStatusInput = scanner.nextLine();    this.familyStatus = FamilyStatus.valueOf(familyStatusInput.toUpperCase());
        System.out.println("Enter user role (Student/Teacher/Manager/Researcher):");
        String roleInput = scanner.nextLine();    this.role = Role.valueOf(roleInput.toUpperCase());
        if (this.role == Role.STUDENT) {
            System.out.println("Enter student's faculty:");        this.faculty = Faculty.valueOf(scanner.nextLine().toUpperCase());
            System.out.println("Enter year of study:");
            this.yearOfStudy = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter organization where the student is a member:");        // Logic for inputting data for Organization, for example:
            // this.member = ...;    } else if (this.role == Role.TEACHER) {
            System.out.println("Enter teacher's salary:");        this.salary = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter teacher's type:");
            this.teacherType = TeacherType.valueOf(scanner.nextLine().toUpperCase());    } else if (this.role == Role.MANAGER) {
            System.out.println("Enter manager's salary:");        this.salary = Integer.parseInt(scanner.nextLine());
        } else if (this.role == Role.RESEARCHER) {        System.out.println("Enter information about the research project:");
            // Logic for inputting data for ResearchProject, for example:        // this.project = ...;
        }
        // Closing the Scanner after use    scanner.close();
    }
    public void removeUser(){

    }

    public void updateUser(){

    }

}
