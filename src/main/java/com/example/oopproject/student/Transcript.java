package com.example.oopproject.student;

import java.util.HashMap;
import java.util.Map;

class Transcript {
    
    private Map<Course, GradeLetter> marks;
    private int totalCredits;
    private double gpa;

    
    public Map<Course, GradeLetter> getMarks() {
		return marks;
	}


	public void setMarks(Map<Course, GradeLetter> marks) {
		this.marks = marks;
	}


	public int getTotalCredits() {
		return totalCredits;
	}


	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public Transcript() {
        marks = new HashMap<>();
        totalCredits = 0;
        gpa = 0.0;
    }

    
    public double getGpa() {
        return gpa;
    }

    public String getInfo() {
        
        return "";
    }

    public void addInfo() {
        
    }
}