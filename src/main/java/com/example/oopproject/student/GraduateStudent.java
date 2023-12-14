package com.example.oopproject.student;

class GraduateStudent extends Student {
	 public GraduateStudent(Faculty faculty, int yearOfStudy, Organization member) {
	     super(faculty, yearOfStudy, member);
	 }

	@Override
	public String getSchedule() {
		return null;
	}


	public void viewDiplomaMark() {
	     
	 }

	@Override
	public String getView() {
		return null;
	}
}