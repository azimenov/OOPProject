package com.example.oopproject.StudentService.View;

import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.controller.StudentController;

import java.util.Scanner;

public class StudentView {
    private final StudentController studentController;
    private Student student;
    private final Scanner scanner;

    public StudentView(StudentController studentController, Student student) {
        this.studentController = studentController;
        this.scanner = new Scanner(System.in);
        this.student = student;
    }

    public void getDefaultView() {
        System.out.println("Welcome to system");
        System.out.println("1. View Courses");
        System.out.println("2. View Teachers");
        System.out.println("3. View Marks");

        System.out.print("Select option: ");
        int option = scanner.nextInt();
        if(option == 1){
            seeCourses();
        }
        else if(option == 2){
            viewInfoAboutTeacher();
        }
        else if(option == 3){
            viewMarks();
        }
    }

    public void seeCourses() {
        System.out.println("Your Courses:");
        for (String course : studentController.getAllCourses(student)) {
            System.out.println(course);
        }
    }

    public void viewInfoAboutTeacher() {
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        String teacherInfo = studentController.viewInfoAboutTeacher(student, courseName);
        if (teacherInfo != null) {
            System.out.println(teacherInfo);
        } else {
            System.out.println("Teacher information not found for this course.");
        }
    }

    public void viewMarks() {
        System.out.println("Your Marks:");
        for (Mark mark : studentController.viewMarks(student)) {
            System.out.println(mark);
        }
    }
}



