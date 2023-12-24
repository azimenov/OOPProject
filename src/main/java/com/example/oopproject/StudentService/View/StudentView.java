package com.example.oopproject.StudentService.view;

import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.controller.StudentController;

public class StudentView {
    protected Student student;
    protected StudentController studentController;

    public StudentView(Student student, StudentController studentController) {
        this.student = student;
        this.studentController = studentController;
    }

    public void getDefaultView(){
        System.out.print("Welcome to system\n1. View Courses\n2. View Courses\n3. View Teachers");
    }
}
