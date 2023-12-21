package com.example.oopproject.student.StudentTypes;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.student.enums.Faculty;
import com.example.oopproject.student.enums.Organization;

class Phd extends GraduateStudent {

	public Phd(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy, Organization organization) {
		super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, faculty, yearOfStudy, organization);
	}

	public void defendScientificReport() {
	     
	 }

	 public void createResearcher() {
	    
	 }
}