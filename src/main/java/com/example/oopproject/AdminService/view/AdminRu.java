package com.example.oopproject.AdminService.view;

import com.example.oopproject.AdminService.controller.AdminController;
import com.example.oopproject.AdminService.model.Admin;

import java.util.Scanner;

public class AdminViewEn {
    private AdminController adminController;
    private Admin admin;

    public void getView(){
        System.out.print("Добро пожаловать в систему\n 1.Добавить пользователя\n2. Удалить пользователя\n3.Обновить");

    }

    public void addUser() {    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите идентификатор пользователя:");
        this.id = scanner.nextLine();
        System.out.println("Введите адрес электронной почты пользователя:");    this.email = scanner.nextLine();
        System.out.println("Введите пароль пользователя:");
        this.password = scanner.nextLine();
        System.out.println("Введите имя пользователя:");    this.firstName = scanner.nextLine();
        System.out.println("Введите фамилию пользователя:");
        this.lastName = scanner.nextLine();
        System.out.println("Введите номер телефона пользователя:");    this.phoneNumber = scanner.nextLine();
        System.out.println("ведите пол пользователя (мужчина/женщина):");
        String genderInput = scanner.nextLine();    this.gender = Gender.valueOf(genderInput.toUpperCase());
        System.out.println("Введите семейный статус пользователя:");
        String familyStatusInput = scanner.nextLine();    this.familyStatus = FamilyStatus.valueOf(familyStatusInput.toUpperCase());
        System.out.println("Введите роль пользователя (Студент/Преподаватель/Менеджер/Исследователь):");
        String roleInput = scanner.nextLine();    this.role = Role.valueOf(roleInput.toUpperCase());
        if (this.role == Role.STUDENT) {
            System.out.println("Введите факультет студента:");        this.faculty = Faculty.valueOf(scanner.nextLine().toUpperCase());
            System.out.println("Введите год обучения:");
            this.yearOfStudy = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите организацию, членом которой является студент:");        // Logic for inputting data for Organization, for example:
            // this.member = ...;    } else if (this.role == Role.TEACHER) {
            System.out.println("Введите зарплату учителя:");        this.salary = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите тип учителя:");
            this.teacherType = TeacherType.valueOf(scanner.nextLine().toUpperCase());    } else if (this.role == Role.MANAGER) {
            System.out.println("Введите зарплату менеджера:");        this.salary = Integer.parseInt(scanner.nextLine());
        } else if (this.role == Role.RESEARCHER) {        System.out.println("Введите информацию об исследовательском проекте:");
            // Logic for inputting data for ResearchProject, for example:        // this.project = ...;
        }
        // Closing the Scanner after use    scanner.close();
    }
    public void removeUser(){

    }

    public void updateUser(){

    }

}
