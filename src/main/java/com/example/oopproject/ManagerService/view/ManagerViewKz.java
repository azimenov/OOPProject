package com.example.oopproject.ManagerService.view;

import com.example.oopproject.EmployeeService.view.EmployeeView;
import com.example.oopproject.ManagerService.Manager;
import com.example.oopproject.ManagerService.view.ManagerView;
import com.example.oopproject.ManagerService.controller.ManagerController;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.model.Major;

import java.util.Scanner;

public class ManagerViewKz extends ManagerView {
    Manager manager;
    ManagerController managerController;

    public ManagerView(Manager manager, ManagerController managerController) {
        this.manager = manager;
        this.managerController = managerController;
    }

    public void getDefaultView() {
        System.out.println("Системаға қош келдіңіз\n1.Хабарламаларды көру\n2.Барлық хабарламаларды көру\n3.Хабар жіберу\n4.Оқушыны курстарға тіркеу\n5.Курс оқытушысына курс тағайындау\n6.Курсты ашу");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();

        if (option == 1) {
            seeMessages();
        } else if (option == 2) {
            seeUnreadMessages();
        } else if (option == 3) {
            sendMessage();
        } else if (option == 4) {
            registerStudent();
        } else if (option == 5) {
            assignCourseToTeacher();
        } else if (option == 6) {
            createCourse();
        }
    }

    void registerStudent() {
        managerController.registerStudentForCourse();
    }

    void assignCourseToTeacher() {
        managerController.assignCourseToTeacher();
    }

    void createCourse() {
        managerController.activateCourse();
    }

    public void registerStudentForCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оқушының электронды пошта мекенжайын енгізіңіз:");
        String email = scanner.nextLine();
        System.out.println("Курстың атын енгізіңіз:");
        String courseName = scanner.nextLine();
        System.out.println("Топ номерін енгізіңіз:");
        int groupNumber = scanner.nextInt();

        managerController.registerStudentForCourse(email, courseName, groupNumber);
    }

    public void assignCourseToTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оқытушының электронды пошта мекенжайын енгізіңіз:");
        String email = scanner.nextLine();
        System.out.println("Курстың атын енгізіңіз:");
        String courseName = scanner.nextLine();
        System.out.println("Топ номерін енгізіңіз:");
        int groupNumber = scanner.nextInt();

        managerController.assignCourseToTeacher(email, courseName, groupNumber);
    }

    public void openCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Курстың атын енгізіңіз:");
        String courseName = scanner.nextLine();

        System.out.println("Курстың ID-сын енгізіңіз:");
        String courseId = scanner.nextLine();

        System.out.println("Курстың кредитін енгізіңіз:");
        int credits = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Курстың мақсатын енгізіңіз:");
        System.out.println("Қол жетімді мамандықтар: FIT, BS, KMA, SEPI, SG");
        String majorInput = scanner.nextLine();

        Faculty faculty;
        try {
            faculty = Faculty.valueOf(majorInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Қате мамандық көрсетілді!");
            return;
        }

        Major major = new Major("", faculty);

        System.out.println("Курс ашылды: " + courseName);
    }
}
