package com.example.oopproject.student.StudentTypes;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.student.enums.Faculty;
import com.example.oopproject.student.enums.Organization;
import com.example.oopproject.student.Student;

class GraduateStudent extends Student {
	public GraduateStudent(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, Faculty faculty, int yearOfStudy, Organization organization) {
		super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, faculty, yearOfStudy, organization);
	}

	public void getSchedule() {
		return ;
	}


	public void viewDiplomaMark() {
	     
	}
	public void getView() {
		return ;
	}
}