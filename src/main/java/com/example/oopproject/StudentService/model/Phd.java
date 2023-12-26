package com.example.oopproject.StudentService.model;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.enums.Organization;

// Phd class extending GraduateStudent
class Phd extends GraduateStudent {

    // Constructor for initializing Phd
    public Phd(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy, Organization organization) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, faculty, yearOfStudy, organization);
    }

    // Method representing the defense of a scientific report by a Ph.D. student
    public void defendScientificReport() {
        // Implement logic for defending a scientific report
    }

    // Method for creating a researcher (possibly related to a Ph.D. program)
    public void createResearcher() {
        // Implement logic for creating a researcher
    }
}
