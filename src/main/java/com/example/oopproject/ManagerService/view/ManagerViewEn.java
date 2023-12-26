package com.example.oopproject.ManagerService.view;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Course;
import com.example.oopproject.EmployeeService.model.Message;
import com.example.oopproject.ManagerService.controller.ManagerController;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.enums.Faculty;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ManagerViewEn {
    Manager manager;
    ManagerController managerController;
    Scanner sc ;

    /**
     * Constructor for ManagerViewEn class.
     * Initializes the Manager and ManagerController and sets up a Scanner for user input.
     * @param manager The Manager instance to be initialized.
     * @param managerController The ManagerController instance to be initialized.
     */
    public ManagerViewEn(Manager manager, ManagerController managerController) {
        super();
        this.manager = manager;
        this.managerController = managerController;
        sc = new Scanner(System.in);
    }



    /**
     * Displays the main menu for the Manager view and performs actions based on user input.
     * Options include seeing messages, sending messages, registering students for courses, assigning courses to teachers, etc.
     * Uses Scanner to get user input for selecting options.
     */
    public void getView() {

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

    /**
     * Displays unread messages for the Manager.
     * Retrieves unread messages from the ManagerController and prints each message.
     * After displaying the messages, returns to the main view.
     */
    public void seeMessages(){
        for(Message message: managerController.getUnreadMessages(manager)){
            System.out.println(message);
        }
        getView();
    }


    /**
     * Displays all messages for the Manager, including read and unread messages.
     * Retrieves all messages from the ManagerController and prints each message.
     * After displaying the messages, returns to the main view.
     */
    public void seeUnreadMessages(){
        for(Message message: managerController.getAllMessages(manager)){
            System.out.println(message);
        }
        getView();
    }


    /**
     * Composes and sends a message initiated by the Manager.
     * Collects input for recipient email, message theme, text, and sender's email using Scanner.
     * Sends the constructed message using the ManagerController.
     * Returns to the main view after sending the message.
     */

    public void sendMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write email: ");
        String email = sc.next();
        System.out.println("Enter message theme:");
        String theme = sc.next();

        System.out.println("Enter message text:");
        String text = sc.next();

        System.out.println("Enter your email:");
        String sender = sc.next();

        managerController.sendMessage(new Message(theme, text, sender, false, LocalDateTime.now()), email);
        getView();
    }

    /**
     * Registers a student for a course as initiated by the Manager.
     * Prompts for student email, course name, and group number using Scanner.
     * Calls the ManagerController to register the student for the specified course.
     * Returns to the main view after registering the student.
     */
    public void registerStudentForCourse() {
        System.out.println("Enter student email:");
        String email = sc.next();
        System.out.println("Enter course name:");
        String courseName = sc.next();
        System.out.println("Enter group number:");
        int groupNumber = sc.nextInt();

        managerController.registerStudentForCourse(email, courseName, groupNumber);
        getView();
    }


    /**
     * Assigns a course to a teacher as initiated by the Manager.
     * Prompts for teacher email, course name, and group number using Scanner.
     * Uses the ManagerController to assign the specified course to the teacher.
     * Returns to the main view after assigning the course to the teacher.
     */
    public void assignCourseToTeacher() {
        System.out.println("Enter teacher email:");
        String email = sc.next();
        System.out.println("Enter course name:");
                String courseName = sc.next();
        System.out.println("Enter group number:");
        int groupNumber = sc.nextInt();

        managerController.assignCourseToTeacher(email, courseName, groupNumber);
        getView();
    }


    /**
     * Opens a course within the system as initiated by the Manager.
     * Collects input for course details such as name, ID, credits, major, and number of students using Scanner.
     * Utilizes the ManagerController to activate the course in the system.
     * Returns to the main view after opening the course.
     */

    public void openCourse() {
        System.out.println("Enter course name:");
        String courseName = sc.next();

        System.out.println("Enter course ID:");
        String courseId = sc.next();

        System.out.println("Enter course credits:");
        int credits = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter course major:");
        System.out.println("Available majors: FIT, BS, KMA, SEPI, SG");
        String majorInput = sc.next();

        Faculty faculty;
        try {
            faculty = Faculty.valueOf(majorInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid major input!");
            return;
        }

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        managerController.activateCourse(new ActivatedCourses(new Course(courseName, courseId, credits), number));
        System.out.println("Course opened: " + courseName);
        getView();
    }


}
