package com.example.oopproject.StudentService.model;

import com.example.oopproject.CourseService.Group;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.enums.Organization;

import java.io.Serializable;
import java.util.*;

// Student class extending User and implementing Serializable
public class Student extends User implements Serializable {

    // Fields to store student information
    protected Faculty faculty; // Represents the faculty of the student
    protected int yearOfStudy; // Represents the year of study for the student
    protected Organization member; // Represents the organization membership of the student
    protected Vector<Group> groups; // Represents the groups associated with the student
    protected Vector<Mark> marks; // Represents the marks associated with the student

    // Constructor initializing a Student object with organization
    public Student(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy, Organization organization) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role);
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
        this.member = organization;
        groups = new Vector<>(); // Initialize groups vector
        marks = new Vector<>(); // Initialize marks vector
    }

    // Constructor initializing a Student object without organization
    public Student(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role);
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
        groups = new Vector<>(); // Initialize groups vector
        marks = new Vector<>(); // Initialize marks vector
    }

    // Getter and Setter methods for faculty, yearOfStudy, and member

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

    // Equals method to compare Student objects
    // Overrides the default equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return yearOfStudy == student.yearOfStudy && Objects.equals(faculty, student.faculty) && Objects.equals(member, student.member);
    }

    // toString method to represent Student information as a string
    // Overrides the default toString method
    @Override
    public String toString() {
        return "Student{" +
                "faculty=" + faculty +
                ", yearOfStudy=" + yearOfStudy +
                ", member=" + member +
                '}';
    }

    // Method to add a group to the student's groups
    public void addGroup(Group group) {
        groups.add(group);
    }

    // Getter method for groups
    public Vector<Group> getGroups() {
        return groups;
    }

    // Setter method for groups
    public void setGroups(Vector<Group> groups) {
        this.groups = groups;
    }

    // Getter method for marks
    public Vector<Mark> getMarks() {
        return marks;
    }

    // Setter method for marks
    public void setMarks(Vector<Mark> marks) {
        this.marks = marks;
    }

    // Method to add a mark to the student's marks
    public void addMark(Mark mark) {
        marks.add(mark);
    }
}

