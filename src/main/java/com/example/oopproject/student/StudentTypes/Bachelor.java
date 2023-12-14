package com.example.oopproject.student.StudentTypes;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;

import java.util.Scanner;
import java.util.Vector;

public class Bachelor extends Student {
    public Bachelor(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, int yearOfStudy) {
        super(id, email, password, firstName, lastName, phoneNumber, gender, familyStatus, yearOfStudy);
    }

    public Bachelor(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus) {
        super(id, email, password, firstName, lastName, phoneNumber, gender, familyStatus);
    }

    public Bachelor(String email ,String password, Role role){
        super();
        this.email = email;
        this.password = password;
        roles = new Vector<Role>();
        roles.add(role);
    }
    public Bachelor(String email, String password) {
        super(email, password);
    }
    public void getInfo(){
        System.out.print(email+password);
    }

    @Override
    public void getView() {
        Scanner sc = new Scanner(System.in);
        String option = "";
        boolean log_out = false;
            System.out.println("schedule\nview courses\nlog out");
            option = sc.next();
            if(option.equals("schedule")){
                getSchedule();
            }
            if(option.equals("courses")){
                viewCourses();
            }
            if(option.equals("log out")){
                return;
            }

    }
    @Override
    public void getSchedule() {
        System.out.println( "Will be soon");
    }

}
