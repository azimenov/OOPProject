package com.example.oopproject.student.StudentTypes;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;
import com.example.oopproject.student.enums.Faculty;
import com.example.oopproject.student.enums.Organization;

import java.util.Scanner;
import java.util.Vector;

public class Bachelor extends Student {


    public Bachelor(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy, Organization organization) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, faculty, yearOfStudy, organization);
    }

    public Bachelor(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, faculty, yearOfStudy);
    }

    @Override
    public void getView() {
        System.out.println("View Schedule\nView Courses\nlog out");
        while(true){
            System.out.print("Choose: ");
            String option = sc.next();
            if (option.equals("View Schedule")) {
                getSchedule();
            }
            else if (option.equals("View Courses")) {
                viewCourses();
            }
            else if (option.equals("log out")) {
                return;
            }
        }

    }
    public void viewCourses(){
        if(courses == null || courses.size() == 0){
            System.out.print("No courses registered");
        }
        else{
            for(ActivatedCourses activatedCourses: courses) {
                System.out.println(activatedCourses.getCourse().getName());
            }
        }
        getView();

    };
    @Override
    public void getSchedule() {
        System.out.println("Will be soon");
        while(true){;
            System.out.print("Get command");
            String op = sc.next();
            if(op.equals("exit")) {
                getView();
            }
        }
    }
}
