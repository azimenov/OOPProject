package com.example.oopproject.StudentService.view;

import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

// View class for English language
public class StudentViewEn {
    protected final StudentController studentController; // Controller to interact with student data
    protected final Scanner scanner; // Scanner for user input
    protected Student student; // Current student

    // Constructor initializing with a StudentController and a Student
    public StudentViewEn(StudentController studentController, Student student) {
        this.studentController = studentController;
        scanner = new Scanner(System.in);
        this.student = student;
    }

    // Method to display the default view options
    public void getDefaultView() {
        System.out.println("Welcome to the system");
        System.out.println("1. View Courses");
        System.out.println("2. View Teachers");
        System.out.println("3. View Marks");

        System.out.print("Select an option: ");
        int option = scanner.nextInt();
        if (option == 1) {
            seeCourses();
        } else if (option == 2) {
            viewInfoAboutTeacher();
        } else if (option == 3) {
            viewMarks();
        }
    }

    // Method to display the courses of the student
    public void seeCourses() {
        System.out.println("Your Courses:");
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
            System.out.println(course);
        }
    }

    // Method to view information about a teacher for a specific course
    public void viewInfoAboutTeacher() {
        System.out.print("Enter course name: ");
        String courseName = scanner.next();

        String teacherInfo = studentController.viewInfoAboutTeacher(student, courseName);
        if (teacherInfo != null) {
            System.out.println(teacherInfo);
        } else {
            System.out.println("Teacher information not found for this course.");
        }
    }

    // Method to view the marks of the student
    public void viewMarks() {
        System.out.println("Your Marks:");
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}
