package com.example.oopproject.StudentService.repository;

import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.db.DataBase;

import java.util.List;

// Implementation of StudentRepository interface
public class StudentRepositoryImpl implements StudentRepository {

    private final DataBase dataBase; // Database to store student data

    // Constructor initializing with a DataBase object
    public StudentRepositoryImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    // Finds a student by email
    @Override
    public Student findStudentByEmail(String email) {
        // Filter the student database by email and return the first match or null
        return (Student) dataBase.getStudentDatabase().stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    // Finds a student by ID
    @Override
    public Student findStudentById(String Id) {
        // Filter the student database by ID and return the first match or null
        return (Student) dataBase.getStudentDatabase().stream()
                .filter(student -> student.getId().equals(Id))
                .findFirst()
                .orElse(null);
    }

    // Adds a student to the database
    @Override
    public void addStudent(Student student) {
        dataBase.getStudentDatabase().add(student);
    }

    // Retrieves all students from the database
    @Override
    public List<Student> getAllStudent() {
        return dataBase.getStudentDatabase(); // Returns the list of students from the database
    }
}
