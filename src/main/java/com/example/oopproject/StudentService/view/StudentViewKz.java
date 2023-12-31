package com.example.oopproject.StudentService.view;

import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;

import java.util.HashSet;
import java.util.Vector;

// Kazakh language view class extending the English view
public class StudentViewKz extends StudentViewEn {

    // Constructor initializing with a StudentController and a Student
    public StudentViewKz(StudentController studentController, Student student) {
        super(studentController, student);
    }

    // Method to display the Kazakh view options
    private void displayKazakhView() {
        System.out.println("Жүйеге қош келдіңіз");
        System.out.println("1. Курстарды шолу");
        System.out.println("2. Мұғалімдерді шолу");
        System.out.println("3. Бағаларды шолу");
    }

    // Overridden method to display courses in Kazakh language
    @Override
    public void seeCourses() {
        System.out.println("Сіздің курстарыңыз:");
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
            System.out.println(course);
        }
    }

    // Overridden method to view teacher information in Kazakh language
    @Override
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

    // Overridden method to view marks in Kazakh language
    @Override
    public void viewMarks() {
        System.out.println("Сіздің бағаларыңыз:");
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}
