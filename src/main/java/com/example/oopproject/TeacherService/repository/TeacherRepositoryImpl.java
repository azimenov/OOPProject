package com.example.oopproject.TeacherService.repository;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.util.List;

public class TeacherRepositoryImpl extends EmployeeRepositoryImpl implements TeacherRepository {
    public TeacherRepositoryImpl(DataBase dataBase) {
        super(dataBase);
    }

    /**
     * Finds a teacher by email.
     * @param email The email of the teacher.
     * @return The Teacher object if found, null otherwise.
     */
    @Override
    public Teacher findTeacherByEmail(String email) {
        return (Teacher) dataBase.getEmployeeDatabase().stream()
                .filter(user -> user.getEmail().equals(email) && user.getRole() == Role.Teacher)
                .findFirst().orElse(null);
    }

    /**
     * Finds a teacher by ID.
     * @param id The ID of the teacher.
     * @return The Teacher object if found, null otherwise.
     */
    @Override
    public Teacher findTeacherById(String id) {
        return (Teacher) dataBase.getEmployeeDatabase().stream()
                .filter(user -> user.getId().equals(id) && user.getRole() == Role.Teacher)
                .findFirst().orElse(null);
    }

    /**
     * Retrieves a list of all teachers.
     * @return A list containing all the teachers.
     */
    @Override
    public List<Employee> getAllTeachers() {
        return dataBase.getEmployeeDatabase().stream()
                .filter(user -> user.getRole() == Role.Teacher)
                .toList();
    }

    /**
     * Adds a new teacher to the repository.
     * @param teacher The Teacher object to be added.
     */
    @Override
    public void addTeacher(Teacher teacher) {
        super.addEmployee(teacher);
    }
}
