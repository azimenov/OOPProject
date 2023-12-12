package com.example.oopproject.StudentPackage;

import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;

public abstract class Student extends User {
    protected int yearOfStudy;
    public Student(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, int yearOfStudy) {
        super(id, email, password, firstName, lastName, phoneNumber, gender, familyStatus);
        this.yearOfStudy = yearOfStudy;
    }
    public Student(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus) {
        super(id, email, password, firstName, lastName, phoneNumber, gender, familyStatus);
    }
    public Student(String email, String password) {
        super(email, password);
    }
    public abstract String getSchedule();
}
