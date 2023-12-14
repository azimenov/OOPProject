package com.example.oopproject.student.StudentTypes;

import com.example.oopproject.student.enums.Faculty;
import com.example.oopproject.student.enums.Organization;

class Master extends GraduateStudent {
	 public Master(Faculty faculty, int yearOfStudy, Organization member) {
	     super(faculty, yearOfStudy, member);
	 }

	 public void defendThesis() {
	    
	 }
}
