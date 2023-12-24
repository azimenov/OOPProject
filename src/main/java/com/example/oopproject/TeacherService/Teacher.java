package com.example.oopproject.TeacherService;

import com.example.oopproject.CourseService.Course;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.util.Collection;
import java.util.Vector;

public class Teacher extends Employee {
    private TeacherType teacherType;
    private Vector<Group> groups;

    public Teacher(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase, TeacherType teacherType) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase);
        this.teacherType = teacherType;
        groups = new Vector<>();
    }

    public TeacherType getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public Vector<Group> getGroups() {
        return groups;
    }

    public void setGroups(Vector<Group> groups) {
        this.groups = groups;
    }
}
