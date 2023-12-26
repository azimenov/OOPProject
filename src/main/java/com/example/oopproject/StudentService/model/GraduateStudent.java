package com.example.oopproject.StudentService.model;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.enums.Organization;

// GraduateStudent class extending Student class
class GraduateStudent extends Student {

    // Constructor for initializing GraduateStudent
    public GraduateStudent(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy, Organization organization) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, faculty, yearOfStudy, organization);
    }

    // Method to get the schedule of the graduate student
    public void getSchedule() {
        // Method implementation goes here
        // Possibly retrieve and handle the schedule
    }

    // Method to view diploma mark of the graduate student
    public void viewDiplomaMark() {
        // Method implementation goes here
        // Logic to view the diploma mark
    }

    // Method to perform a view action (but currently returning void)
    public void getView() {
        return; // This method currently returns void
        // Implement logic or change return type if needed
    }
}
