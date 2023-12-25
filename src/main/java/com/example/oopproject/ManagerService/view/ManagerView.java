package com.example.oopproject.ManagerService.view;

import com.example.oopproject.EmployeeService.view.EmployeeView;
import com.example.oopproject.ManagerService.controller.ManagerController;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.model.Student;
import javafx.scene.input.Mnemonic;

import java.util.Scanner;

public class ManagerView extends EmployeeView {
    Manager manager;
    ManagerController managerController;
    Scanner sc ;
    public ManagerView(Manager manager, ManagerController managerController) {
        super();
        this.manager = manager;
        this.managerController = managerController;
        sc = new Scanner(System.in);
    }

    public void getDefaultView() {

        System.out.println("Welcome to system\n1.See messages\n2.See all messages\n3.Send Messages\n4.Register student to course\n5.Assign course to teacher\n6.Open course");
        Scanner sc = new Scanner(System.in);
        System.out.print("Write option: ");
        int option = sc.nextInt();

        if (option == 1) {
            seeMessages();
        } else if (option == 2) {
            seeUnreadMessages();
        } else if (option == 3) {
            sendMessage();
        } else if (option == 4) {
            registerStudentForCourse();
        } else if (option == 5) {
            assignCourseToTeacher();
        } else if (option == 6) {
            openCourse();
        }
    }

    public void registerStudentForCourse() {
        System.out.println("Enter student email:");
        String email = sc.nextLine();
        System.out.println("Enter course name:");
        String courseName = sc.nextLine();
        System.out.println("Enter group number:");
        int groupNumber = sc.nextInt();

        managerController.registerStudentForCourse(email, courseName, groupNumber);
        getView();
    }

    public void assignCourseToTeacher() {
        System.out.println("Enter teacher email:");
        String email = sc.nextLine();
        System.out.println("Enter course name:");
        String courseName = sc.nextLine();
        System.out.println("Enter group number:");
        int groupNumber = sc.nextInt();

        managerController.assignCourseToTeacher(email, courseName, groupNumber);
        getView();
    }

    public void openCourse() {
        System.out.println("Enter course name:");
        String courseName = sc.nextLine();

        System.out.println("Enter course ID:");
        String courseId = sc.nextLine();

        System.out.println("Enter course credits:");
        int credits = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter course major:");
        System.out.println("Available majors: FIT, BS, KMA, SEPI, SG");
        String majorInput = sc.nextLine();

        Faculty faculty;
        try {
            faculty = Faculty.valueOf(majorInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid major input!");
            return;
        }

        Faculty major ;
        try {
            major = Faculty.valueOf(majorInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid major input!");
            return;
        }

        System.out.println("Course opened: " + courseName);
        getView();
    }


}