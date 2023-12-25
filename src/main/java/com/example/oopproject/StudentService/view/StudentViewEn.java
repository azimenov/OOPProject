package com.example.oopproject.StudentService.view;

import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class StudentViewEn {
    private final StudentController studentController;
    private final Scanner scanner;
    private Student student;

    public StudentViewEn(StudentController studentController, Student student) {
        this.studentController = studentController;
        scanner = new Scanner(System.in);
        this.student =student;
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
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
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
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}