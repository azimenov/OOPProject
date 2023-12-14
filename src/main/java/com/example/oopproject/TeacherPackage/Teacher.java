package com.example.oopproject.TeacherPackage;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.Employee.Employee;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;

import java.util.Scanner;
import java.util.Vector;

public class Teacher extends Employee {
    private TeacherType teacherType;
    private Vector<ActivatedCourses> courses;

    public Teacher(TeacherType teacherType) {
        super();
        this.teacherType = teacherType;
    }

    public Teacher(String email ,String password, Role role){
        super();
        this.email = email;
        this.password = password;
        roles = new Vector<Role>();
        roles.add(role);
        courses = new Vector<ActivatedCourses>();
    }

    public TeacherType getTeacherType() {
        return teacherType;
    }
    public void addCourse(ActivatedCourses course){
        courses.add(course);
    }
    public void getView(){
        Scanner sc = new Scanner(System.in);
        System.out.println("view courses\nlog out");
        String option = sc.next();
        if(option.equals("courses")){
            viewCourses();
        }
    };
    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public void uploadFiles(){}

    public void sendComplainToDean(){}

    public void putMark(Student student, Course course, double mark){};

    public  void putAttendance(Student student, Course course, boolean present){};

    public void viewCourses(){
        if(courses == null){
            System.out.print("No courses registered");
            return;
        }
        for(ActivatedCourses activatedCourses: courses){
            System.out.println(activatedCourses.getCourse().getName());
        }
    };

    public void viewTeacherSchedules() {}
}
