package com.example.oopproject.TeacherService;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.util.Vector;

public class Teacher extends Employee {
    private TeacherType teacherType;
    private Vector<ActivatedCourses> courses;

    public Teacher(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase, TeacherType teacherType) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase);
        this.teacherType = teacherType;
        courses = new Vector<>();
    }

    public TeacherType getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public Vector<ActivatedCourses> getCourses() {
        return courses;
    }

    public void setCourses(Vector<ActivatedCourses> courses) {
        this.courses = courses;
    }

    public void addCourse(ActivatedCourses course){
        courses.add(course);
    }

}
