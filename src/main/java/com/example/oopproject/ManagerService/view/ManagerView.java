package com.example.oopproject.ManagerService.view;

import com.example.oopproject.EmployeeService.view.EmployeeView;
import com.example.oopproject.ManagerService.Manager;
import com.example.oopproject.ManagerService.controller.ManagerController;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.model.Student;
import javafx.scene.input.Mnemonic;

import java.util.Scanner;

public class ManagerView extends EmployeeView{
    Manager manager;
    ManagerController managerController;
    public ManagerView(Manager manager, ManagerController managerController) {
        this.manager = manager;
        this.managerController = managerController;
    }

    public void getDefaultView(){

        System.out.println("Welcome to system\n1.See messages\n2.See all messages\n3.Send Messages\n4.Register student to course\n5.Assign course to teacher\n6.Open course");
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
            registerStudent();
        }
        else if(option == 5){
            assignCourseToTeacher();
        }
        else if(option == 6){
            createCourse();
        }
    }

    void registerStudent(){
        managerController.registerStudentForCourse();
    }
    void assignCourseToTeacher(){
        managerController.assignCourseToTeacher();
    }
    void createCourse(){
        managerController.activateCourse();
    }


}