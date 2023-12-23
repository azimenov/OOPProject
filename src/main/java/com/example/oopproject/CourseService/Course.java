package com.example.oopproject.CourseService;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String courseId;
    private int credits;
    private List<String> files;

    public Course(String name, String courseId){
        this.name = name;
        this.courseId= courseId;
    }
    public Course(String name, String courseId, int credits) {
        this.name = name;
        this.courseId = courseId;
        this.credits = credits;
        files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

}
