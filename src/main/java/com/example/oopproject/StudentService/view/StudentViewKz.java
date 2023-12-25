package com.example.oopproject.StudentService.view;

import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class StudentViewKz {
    private final StudentController studentController;
    private Student student;
    private final Scanner scanner;

    public StudentViewKz(StudentController studentController, Student student) {
        this.studentController = studentController;
        this.student = student;
        scanner = new Scanner(System.in);
    }

    private void displayKazakhView() {
       System.out.println("Жүйеге қош келдіңіз");
        System.out.println("1. Курстарды шолу");
        System.out.println("2. Мұғалімдерді шолу");
        System.out.println("3. Бағаларды шолу");
    }

    public void seeCourses() {
        System.out.println("Сіздің курстарыңыз:");
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void viewInfoAboutTeacher() {
        System.out.print("Курс атын енгізіңіз: ");
        String courseName = scanner.nextLine();

        String teacherInfo = studentController.viewInfoAboutTeacher(student, courseName);
        if (teacherInfo != null) {
            System.out.println(teacherInfo);
        } else {
            System.out.println("Бұл курс үшін мұғалім туралы ақпарат табылмады.");
        }
    }

    public void viewMarks() {
        System.out.println("Сіздің бағаларыңыз:");
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}