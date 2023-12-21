package com.example.oopproject.ManagerPackege;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.util.Scanner;

public class ORManager extends Manager{
    public ORManager(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase);
    }

    public void registerForCourse(String email, int courseCode) {
        ActivatedCourses enrolledCourse = db.findByCode(courseCode);
        enrolledCourse.addStudent(db.findStudentByEmail(email));
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
