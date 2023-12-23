package com.example.oopproject.ManagerService.model;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.util.Scanner;

public class ORManager extends Manager {
    public ORManager(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase);
    }


    @Override
    public String toString() {
        return super.toString() ;
    }
}
