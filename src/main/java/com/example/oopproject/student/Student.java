package com.example.oopproject.student;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import com.example.oopproject.student.enums.Faculty;
import com.example.oopproject.student.enums.Organization;

import java.util.*;


public abstract class Student extends User {

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
    public String viewFinancialInfo() {
        return "OK";
    }
    public void viewCourses(){
        if(courses == null || courses.size() == 0){
            System.out.print("No courses registered");

        }
        for(ActivatedCourses activatedCourses: courses){
            System.out.println(activatedCourses.getCourse().getName());
        }
        getView();

    }

    public void addCourse(ActivatedCourses course) {
        if(courses == null){
            courses = new Vector<ActivatedCourses>();
        }
        courses.add(course);
    }
    public abstract void getSchedule();

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


    public void register(Course course) {

    }

    public void viewTranscript() {

    }


    public void toRequest(Student student, String request) {

    }

    public void viewSchedules(Student student, Object undefined) {

    }

    public void fxRegister() {

    }

    public void willBeAssistant() {

    }

    public void viewExamSchedule(Object undefined) {

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

    public Vector<ActivatedCourses> getCourses() {
        return courses;
    }

    public void setCourses(Vector<ActivatedCourses> courses) {
        this.courses = courses;
    }
}

