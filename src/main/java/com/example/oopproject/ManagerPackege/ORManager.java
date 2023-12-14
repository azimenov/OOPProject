package com.example.oopproject.ManagerPackege;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.util.Scanner;

public class ORManager extends Manager{
    public ORManager(String email, String password, Role role, DataBase db) {
        super(email,  password,  role,  db);
    }

    public void registerForCourse(String email, int courseCode) {
        ActivatedCourses enrolledCourse = db.findByCode(courseCode);
        enrolledCourse.addStudent(db.findBtEmail(email));

    }


    @Override
    public void getView() {
        Scanner sc = new Scanner(System.in);
        String option = "";
        boolean log_out = false;
        System.out.println("register student for course\nlog out");
        option = sc.next();
        if(option.equals("register")){
            System.out.print("Write id of course to register");
            int id = sc.nextInt();
            System.out.print("Write students email");
            String email = sc.next();
            registerForCourse(email, id);
            System.out.println("registered");
        }
        if(option.equals("log out")){
            return;
        }

    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
