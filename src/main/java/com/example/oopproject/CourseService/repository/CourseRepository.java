package com.example.oopproject.CourseService.repository;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Course;

public interface CourseRepository {
    public void openCourse(ActivatedCourses course);
    public Course findCourseById(String id);
    public ActivatedCourses findActivatedCourseById(String id);
    public ActivatedCourses findActivatedCourseByCourseName(String name);
}
