package com.example.oopproject.student;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.student.enums.Faculty;
import com.example.oopproject.student.enums.Organization;

import java.util.*;


public abstract class Student extends User {

    private Faculty faculty;
    private int yearOfStudy;
    private Organization member;
    private Transcript transcript;
    private Vector<ActivatedCourses> courses;


    public Student(Faculty faculty, int yearOfStudy, Organization member) {
        super();
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
        this.member = member;
        this.transcript = new Transcript();
        this.courses = new Vector<>();
    }

    public Student(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, int yearOfStudy) {
    }

    public Student(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        roles = new Vector<Role>();
        roles.add(role);
        courses = new Vector<>();
    }

    public Student(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus) {
    }

    public Student(String email, String password) {
    }

    public Student() {

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

    public void addCourse(ActivatedCourses course) {
        courses.add(course);
    }

    public String viewFinancialInfo() {
        return "OK";
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
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
    public void viewCourses(){
        if(courses == null){
            System.out.print("No courses registered");
            return;
        }
        for(ActivatedCourses activatedCourses: courses){
            System.out.println(activatedCourses.getCourse().getName());
        }
    };


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

