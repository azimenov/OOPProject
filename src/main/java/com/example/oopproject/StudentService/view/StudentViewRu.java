package com.example.oopproject.StudentService.view;

import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;

import java.util.HashSet;
import java.util.Vector;

// Russian language view class extending the English view
public class StudentViewRu extends StudentViewEn {

    // Constructor initializing with a StudentController and a Student
    public StudentViewRu(StudentController studentController, Student student) {
        super(studentController, student);
    }

    // Method to display the Russian view options
    private void displayRussianView() {
        System.out.println("Добро пожаловать в систему");
        System.out.println("1. Посмотреть курсы");
        System.out.println("2. Посмотреть учителей");
        System.out.println("3. Посмотреть оценки");
    }

    // Overridden method to display courses in Russian language
    @Override
    public void seeCourses() {
        System.out.println("Ваши курсы:");
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
            System.out.println(course);
        }
    }

    // Overridden method to view teacher information in Russian language
    @Override
    public void viewInfoAboutTeacher() {
        System.out.print("Введите название курса: ");
        String courseName = scanner.nextLine();

        String teacherInfo = studentController.viewInfoAboutTeacher(student, courseName);
        if (teacherInfo != null) {
            System.out.println(teacherInfo);
        } else {
            System.out.println("Информация о преподавателе для этого курса не найдена.");
        }
    }

    // Overridden method to view marks in Russian language
    @Override
    public void viewMarks() {
        System.out.println("Ваши оценки:");
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}

