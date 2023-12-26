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

/**
 * ManagerViewRu class extends ManagerViewEn and represents the Manager's view in Russian language.
 */
public class ManagerViewRu extends ManagerViewEn {
    Manager manager;
    ManagerController managerController;

    /**
     * Constructor for ManagerViewRu class.
     * Initializes the Manager and ManagerController by calling the super constructor from the base class.
     * @param manager The Manager instance to be initialized.
     * @param managerController The ManagerController instance to be initialized.
     */
    public ManagerViewRu(Manager manager, ManagerController managerController) {
        super(manager, managerController);
    }




    /**
     * Displays the default view menu in Russian for the Manager.
     * Options include seeing messages, sending messages, registering students for courses, assigning courses to teachers, etc.
     * Uses Scanner to get user input for selecting options.
     */
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




    /**
     * Registers a student for a course as initiated by the Manager in Russian language.
     * Prompts for student email, course name, and group number using Scanner.
     * Calls the ManagerController to register the student for the specified course.
     */
    void registerStudent() {
        managerController.registerStudentForCourse();
    }



    /**
     * Assigns a course to a teacher as initiated by the Manager in Russian language.
     * Prompts for teacher email, course name, and group number using Scanner.
     * Uses the ManagerController to assign the specified course to the teacher.
     */
    void assignCourseToTeacher() {
        managerController.assignCourseToTeacher();
    }



    /**
     * Creates a course within the system as initiated by the Manager in Russian language.
     * Collects input for course details such as name, ID, credits, major, and number of students using Scanner.
     * Utilizes the ManagerController to activate the course in the system.
     */
    void createCourse() {
        managerController.activateCourse();
    }



    /**
     * Registers a student for a course as initiated by the Manager in Russian language.
     * Prompts for student email, course name, and group number using Scanner.
     * Calls the ManagerController to register the student for the specified course.
     * @param email The email of the student.
     * @param courseName The name of the course.
     * @param groupNumber The group number of the course.
     */
    public void registerStudentForCourse(String email, String courseName, int groupNumber) {
        managerController.registerStudentForCourse(email, courseName, groupNumber);
    }



    /**
     * Assigns a course to a teacher as initiated by the Manager in Russian language.
     * Prompts for teacher email, course name, and group number using Scanner.
     * Uses the ManagerController to assign the specified course to the teacher.
     * @param email The email of the teacher.
     * @param courseName The name of the course.
     * @param groupNumber The group number of the course.
     */
    public void assignCourseToTeacher(String email, String courseName, int groupNumber) {
        managerController.assignCourseToTeacher(email, courseName, groupNumber);
    }



    /**
     * Opens a course within the system as initiated by the Manager in Russian language.
     * Collects input for course details such as name, ID, credits, major, and number of students using Scanner.
     * Utilizes the ManagerController to activate the course in the system.
     */
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

