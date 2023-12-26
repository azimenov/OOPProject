package com.example.oopproject.TeacherService.repository;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepository;
import com.example.oopproject.TeacherService.Teacher;

import java.util.List;

import java.util.List;

public interface TeacherRepository extends EmployeeRepository {

    /**
     * Finds a teacher by email.
     * @param email The email of the teacher.
     * @return The Teacher object if found, null otherwise.
     */
    Teacher findTeacherByEmail(String email);

    /**
     * Finds a teacher by ID.
     * @param id The ID of the teacher.
     * @return The Teacher object if found, null otherwise.
     */
    Teacher findTeacherById(String id);

    /**
     * Retrieves a list of all teachers.
     * @return A list containing all the teachers.
     */
    List<Employee> getAllTeachers();

    /**
     * Adds a new teacher to the repository.
     * @param teacher The Teacher object to be added.
     */
    void addTeacher(Teacher teacher);
}
