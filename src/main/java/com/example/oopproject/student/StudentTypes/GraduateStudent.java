package com.example.oopproject.student.StudentTypes;

import com.example.oopproject.student.enums.Faculty;
import com.example.oopproject.student.enums.Organization;
import com.example.oopproject.student.Student;

class GraduateStudent extends Student {
	public GraduateStudent(Faculty faculty, int yearOfStudy, Organization member) {
	     super(faculty, yearOfStudy, member);
	 }

	@Override
	public void getSchedule() {
		return ;
	}


	public void viewDiplomaMark() {
	     
	}
	public void getView() {
		return ;
	}
}