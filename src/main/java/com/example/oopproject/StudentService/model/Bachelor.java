package com.example.oopproject.StudentService.model;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.enums.Organization;

// Bachelor class extending Student class
public class Bachelor extends Student {

    // Constructor with additional parameters for organization
    public Bachelor(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy, Organization organization) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, faculty, yearOfStudy, organization);
    }

    // Constructor without organization parameter
    public Bachelor(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, faculty, yearOfStudy);
    }

}
