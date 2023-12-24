package com.example.oopproject.TeacherService.view;

import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.controller.TeacherController;

public class TeacherView {
    protected Teacher teacher;
    protected TeacherController teacherController;


    public TeacherView(Teacher teacher, TeacherController teacherController) {
        this.teacher = teacher;
        this.teacherController = teacherController;
    }

    public void getDefaultView(){
        System.out.print("Welcome to system\n1. View Courses\n2. View Courses\n3. View Students")
    }
}
