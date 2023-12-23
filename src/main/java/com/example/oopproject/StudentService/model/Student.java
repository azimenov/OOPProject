package com.example.oopproject.StudentService.model;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.enums.Organization;

import java.util.*;


public  class Student extends User {

    protected Faculty faculty;
    protected int yearOfStudy;
    protected Organization member;
    protected Vector<ActivatedCourses> courses;

    public Student(String id , String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy, Organization organization) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role);
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
        this.member = organization;
        courses = new Vector<>();
    }

    public Student(String id , String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role);
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
        courses = new Vector<>();
    }
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Organization getMember() {
        return member;
    }

    public void setMember(Organization member) {
        this.member = member;
    }



    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return yearOfStudy == student.yearOfStudy && Objects.equals(faculty, student.faculty) && Objects.equals(member, student.member);
    }

    public String toString() {
        return "Student{" +
                "faculty=" + faculty +
                ", yearOfStudy=" + yearOfStudy +
                ", member=" + member +
                '}';
    }
    public void addCourse(ActivatedCourses course){
        courses.add(course);
    }
    public Vector<ActivatedCourses> getCourses() {
        return courses;
    }

    public void setCourses(Vector<ActivatedCourses> courses) {
        this.courses = courses;
    }
}

