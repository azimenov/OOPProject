package com.example.oopproject.ManagerService.view;

import com.example.oopproject.EmployeeService.view.EmployeeView;
import com.example.oopproject.ManagerService.Manager;
import com.example.oopproject.ManagerService.view.ManagerViewEn;
import com.example.oopproject.ManagerService.controller.ManagerController;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.model.Major;

import java.util.Scanner;

public class ManagerViewRu extends ManagerViewEn {
    Manager manager;
    ManagerController managerController;

    public ManagerViewRu(Manager manager, ManagerController managerController) {
        this.manager = manager;
        this.managerController = managerController;
    }

    public void getDefaultView() {
        System.out.println("Добро пожаловать в систему\n1.Просмотр сообщений\n2.Просмотр всех сообщений\n3.Отправить сообщение\n4.Зарегистрировать студента на курс\n5.Назначить курс преподавателю\n6.Открыть курс");
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
        System.out.println("Введите электронную почту студента:");
        String email = scanner.nextLine();
        System.out.println("Введите название курса:");
        String courseName = scanner.nextLine();
        System.out.println("Введите номер группы:");
        int groupNumber = scanner.nextInt();

        managerController.registerStudentForCourse(email, courseName, groupNumber);
    }

    public void assignCourseToTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите электронную почту преподавателя:");
        String email = scanner.nextLine();
        System.out.println("Введите название курса:");
        String courseName = scanner.nextLine();
        System.out.println("Введите номер группы:");
        int groupNumber = scanner.nextInt();

        managerController.assignCourseToTeacher(email, courseName, groupNumber);
    }

    public void openCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название курса:");
        String courseName = scanner.nextLine();

        System.out.println("Введите ID курса:");
        String courseId = scanner.nextLine();

        System.out.println("Введите количество кредитов:");
        int credits = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите направление курса:");
        System.out.println("Доступные направления: FIT, BS, KMA, SEPI, SG");
        String majorInput = scanner.nextLine();

        Faculty faculty;
        try {
            faculty = Faculty.valueOf(majorInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Неверное направление!");
            return;
        }

        Major major = new Major("", faculty);

        System.out.println("Курс открыт: " + courseName);
    }
}
