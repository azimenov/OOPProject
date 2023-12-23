package com.example.oopproject.StudentService.repository;

import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.db.DataBase;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    public StudentRepositoryImpl(DataBase dataBase){
        this.dataBase = dataBase;
    }
    private final DataBase dataBase;
    @Override
    public Student findStudentByEmail(String email){
        return (Student)dataBase.getStudentDatabase().stream().filter(student -> student.getEmail().equals(email)).findFirst().orElse(null);
    }

    @Override
    public Student findStudentById(String Id) {
        return (Student)dataBase.getStudentDatabase().stream().filter(student -> student.getId().equals(Id)).findFirst().orElse(null);
    }

    @Override
    public void addStudent(Student student) {
        dataBase.getStudentDatabase().add(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return dataBase.getStudentDatabase().stream().toList();
    }
}
