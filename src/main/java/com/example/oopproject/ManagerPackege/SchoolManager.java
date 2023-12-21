package com.example.oopproject.ManagerPackege;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import com.example.oopproject.student.Course;

import java.util.Scanner;

public class SchoolManager extends Manager{


    public SchoolManager(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase);
    }

    public void assignCourseToTeacher(String email, int courseCode) {
        ActivatedCourses enrolledCourses = db.findByCode(courseCode);
        enrolledCourses.setLecturer(db.findTeacherByEmail(email));
        db.findTeacherByEmail(email).addCourse(enrolledCourses);
    }
    public void assignCourseToTeacher(){
        System.out.print("Write teachers email:");
        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        System.out.print("Write course id:");
        int id = sc.nextInt();
        assignCourseToTeacher(email, id);
    }
    public void activateCourse(String id){
        Course course = db.findCourseByCode(id);
        ActivatedCourses enrolledCourse = new ActivatedCourses(course, 1);
        db.addCourse(enrolledCourse);
    }
    @Override
    public void getView() {
        Scanner sc = new Scanner(System.in);
        String option = "";
        boolean log_out = false;
        System.out.println("activate course\nassign teacher course\nlog out");
        option = sc.next();
        if(option.equals("activate")){
            System.out.print("Write id of course to activate");
            String id = sc.next();
            activateCourse(id);
            System.out.println("Course activated");
            System.out.print("Do you want to assign teacher for course?");
            option = sc.next();
            if(option.equals("yes")) {
                assignCourseToTeacher();
            }
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
