package com.example.oopproject.TeacherService.view;

import com.example.oopproject.EmployeeService.view.EmployeeView;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.controller.TeacherController;

import java.util.Scanner;

public class TeacherView extends EmployeeView {
    protected Teacher teacher;
    protected TeacherController teacherController;


    public TeacherView(Teacher teacher, TeacherController teacherController) {
        this.teacher = teacher;
        this.teacherController = teacherController;
    }

    public void getView(){
        System.out.println("Welcome to system\n1.See messages\n2.See all messages\n3.Send Messages\n4.View Courses\n5.View students\n6.Put Marks");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();

        if(option == 1){
            seeMessages();
        }
        else if(option == 2){
            seeUnreadMessages();
        }
        else if(option == 3){
            sendMessage();
        }
        else if(option == 4){
            seeCourses();
        }
        else if(option == 5){
            seeStudents();
        }
    }
    public void seeCourses(){
        teacherController.getAllCourses(teacher);//Zhanel
    }
    public void seeStudents(){
        teacherController.getAllStudents(teacher);//Zhanel
    }
    public void putMarks(){
        teacherController.setMark(teacher, email, mark);//Zhanel
    }
}
