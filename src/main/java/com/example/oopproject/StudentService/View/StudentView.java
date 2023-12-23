package com.example.oopproject.StudentService.View;

import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.model.Student;

import java.util.Scanner;

public class StudentView {
    protected StudentController studentController;
    protected Scanner sc;

    public StudentView(StudentController studentController){
        this.studentController = studentController;
        sc = new Scanner(System.in);
    }
    public void getView() {
        System.out.println("1:View Courses\n2:log out");

        System.out.print("Choose: ");
        int option = sc.nextInt();
        if (option == 1) {
            studentController.viewCourses();
        }
        else if (option == 2) {
            return;
        }
        else{
            getView();
        }
    }
}
