package com.example.oopproject.StudentService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;
import com.example.oopproject.CourseService.Course;

import java.util.Vector;

public class StudentController {
    private final StudentRepositoryImpl studentRepository;
    private final Student student;
    public StudentController(StudentRepositoryImpl studentRepository, Student student){
        this.studentRepository = studentRepository;
        this.student = student;
    }

    public void viewCourses(){
        if(student.getCourses() == null || student.getCourses().size() == 0){
            System.out.print("No courses registered");
        }
        else{
            for(ActivatedCourses activatedCourses: student.getCourses()) {
                System.out.println(activatedCourses.getCourse().getName());
            }
        }
    }

    public void register(Course course) {

    }

    public void viewTranscript() {

    }


    public void viewSchedules(Student student, Object undefined) {

    }

    public void fxRegister() {

    }

    public void willBeAssistant() {

    }

    public void viewExamSchedule(Object undefined) {

    }

    public String viewFinancialInfo() {
        return "OK";
    }

    public void addCourse(ActivatedCourses course) {
        if(student.getCourses() == null){
            student.setCourses(new Vector<ActivatedCourses>());
        }
        student.getCourses().add(course);
    }

}
