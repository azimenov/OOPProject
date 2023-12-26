package com.example.oopproject.TeacherService;

import com.example.oopproject.CourseService.Course;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.io.Serializable;
import java.util.Collection;
import java.util.Vector;

import java.io.Serializable;
import java.util.Vector;

/**
 * Represents a Teacher entity that extends the Employee class and implements Serializable.
 */
public class Teacher extends Employee implements Serializable {
    private TeacherType teacherType; // Тип учителя (например, полная или частичная занятость)
    private Vector<Group> groups; // Группы, связанные с учителем

    /**
     * Constructor to create an instance of Teacher.
     * @param id The ID of the teacher.
     * @param password The password of the teacher.
     * @param firstName The first name of the teacher.
     * @param lastName The last name of the teacher.
     * @param phoneNumber The phone number of the teacher.
     * @param gender The gender of the teacher.
     * @param familyStatus The family status of the teacher.
     * @param role The role of the teacher.
     * @param salary The salary of the teacher.
     * @param teacherType The type of teacher (e.g., full-time, part-time).
     */
    public Teacher(String id, String password, String firstName, String lastName, String phoneNumber,
                   Gender gender, FamilyStatus familyStatus, Role role, int salary, TeacherType teacherType) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary);
        this.teacherType = teacherType;
        groups = new Vector<>(); // Инициализация вектора групп
    }

    /**
     * Gets the type of the teacher.
     * @return The type of teacher.
     */
    public TeacherType getTeacherType() {
        return teacherType;
    }

    /**
     * Sets the type of the teacher.
     * @param teacherType The type of teacher to set.
     */
    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    /**
     * Adds a group to the teacher's list of groups.
     * @param group The group to add.
     */
    public void addGroup(Group group){
        groups.add(group);
    }

    /**
     * Gets the list of groups associated with the teacher.
     * @return The list of groups.
     */
    public Vector<Group> getGroups() {
        return groups;
    }

    /**
     * Sets the list of groups associated with the teacher.
     * @param groups The list of groups to set.
     */
    public void setGroups(Vector<Group> groups) {
        this.groups = groups;
    }
}
