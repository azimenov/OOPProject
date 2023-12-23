package com.example.oopproject.StudentService.repository;

import com.example.oopproject.StudentService.model.Student;

import java.util.List;

public interface StudentRepository {
    public Student findStudentByEmail(String email);
    public Student findStudentById(String Id);
    public void addStudent(Student student);
    public List<Student> getAllStudent();
}
