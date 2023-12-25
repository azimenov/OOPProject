package com.example.oopproject.CourseService.repository;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Course;
import com.example.oopproject.db.DataBase;

public class CourseRepositoryImpl implements CourseRepository{
    private DataBase dataBase;
    public CourseRepositoryImpl(DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public void openCourse(ActivatedCourses course) {
        dataBase.getEnrolledCourses().add(course);
    }

    @Override
    public Course findCourseById(String id) {
        return dataBase.getCourses().stream().filter(course -> course.getCourseId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public ActivatedCourses findActivatedCourseById(String id) {
        return dataBase.getEnrolledCourses().stream().filter(course -> course.getCourse().getCourseId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public ActivatedCourses findActivatedCourseByCourseName(String name) {
        return (ActivatedCourses) dataBase.getEnrolledCourses().stream().filter(activatedCourses -> activatedCourses.getCourse().getName().equals(name));
    }
}
