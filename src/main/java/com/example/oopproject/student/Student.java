package com.example.oopproject.student;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;

import java.util.*;
import java.util.ArrayList;
import java.util.List;


public abstract class Student extends User {
 
 private Faculty faculty;
 private int yearOfStudy;
 private Organization member;
 private Transcript transcript;
 private List<Course> courses;

 
 public Student(Faculty faculty, int yearOfStudy, Organization member) {
     super();
     this.faculty = faculty;
     this.yearOfStudy = yearOfStudy;
     this.member = member;
     this.transcript = new Transcript();
     this.courses = new ArrayList<>();
 }

    public Student(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, int yearOfStudy) {
    }

    public Student(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus) {
    }

    public Student(String email, String password) {
    }

    public abstract String getSchedule();

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
 public void addCourse(Course course) {
     courses.add(course);
 }

 public void viewCourses() {
     for (Course course : courses) {
         System.out.println(course.getName());
     }
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

 public void viewFinancialInfo() {
     
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
}





