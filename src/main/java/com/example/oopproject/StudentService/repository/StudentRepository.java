package com.example.oopproject.StudentService.repository;

import com.example.oopproject.StudentService.model.Student;

import java.util.List;

// Interface defining methods for StudentRepository
public interface StudentRepository {
    // Finds a student by email
    public Student findStudentByEmail(String email);

    // Finds a student by ID
    public Student findStudentById(String Id);

    // Adds a student to the repository
    public void addStudent(Student student);

    // Retrieves all students from the repository
    public List<Student> getAllStudent();
}
