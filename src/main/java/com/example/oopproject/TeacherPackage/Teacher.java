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

    public void viewCourses(){
        if(courses == null){
            System.out.print("No courses registered");
            getView();
        }
        for(ActivatedCourses activatedCourses: courses){
            System.out.println(activatedCourses.getCourse().getName());
            System.out.println("Write back, to back to the view");
            String option = sc.next();
            if(option.equals("back")) getView();
        }
    };

    @Override
    public void getView() {
        System.out.print("Welcome to system\nSee messages\nSend Messages\nView Courses");
        String option = sc.next();
        if(option.equals("See messages")){
            seeMessages();
        }
        else if(option.equals("Send message")){
            sendMessage();
        }
        else if(option.equals("View Courses")){
            viewCourses();
        }
        else if(option.equals("log out")){
            return;
        }
    }

    public void addCourse(ActivatedCourses activatedCourses){
        courses.add(activatedCourses);
    }
}
