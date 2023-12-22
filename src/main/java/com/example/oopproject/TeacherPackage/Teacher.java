package com.example.oopproject.TeacherPackage;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.Employee.Employee;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;

import java.util.Scanner;
import java.util.Vector;

public class Teacher extends Employee {
    private TeacherType teacherType;
    private Vector<ActivatedCourses> courses;

    public Teacher(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase, TeacherType teacherType) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase);
        this.teacherType = teacherType;
        courses = new Vector<>();
    }

    private void viewCourses(){
        if(courses == null){
            System.out.print("No courses registered");
            getView();
        }
        for(ActivatedCourses activatedCourses: courses){
            System.out.println(activatedCourses.getCourse().getName());
            System.out.println("Write back, to back to the view");
            String option = sc.next();
            getView();
        }
    };

    @Override
    public void getView() {
        System.out.print("Welcome to system\n1: See messages\n2: Send Messages\n3: View Courses");
        int option = sc.nextInt();
        if(option == 1){
            seeMessages();
        }
        else if(option==2){
            sendMessage();
        }
        else if(option==3){
            viewCourses();
        }
        else if(option==0){
            return;
        }
    }

    public void addCourse(ActivatedCourses activatedCourses){
        courses.add(activatedCourses);
    }
}
