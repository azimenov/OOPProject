package com.example.oopproject.StudentService.view;

import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class StudentViewRu extends StudentViewEn {
    public StudentViewRu(StudentController studentController, Student student) {
        super(studentController, student );
    }

     private void displayRussianView() {
        System.out.println("Добро пожаловать в систему");
        System.out.println("1. Посмотреть курсы");
        System.out.println("2. Посмотреть учителей");
        System.out.println("3. Посмотреть оценки");

    }

    public void seeCourses() {
        System.out.println("Ваши курсы:");
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
            System.out.println(course);
        }
    }

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

    public void viewMarks() {
        System.out.println("Ваши оценки:");
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}
