package com.example.oopproject.StudentPackage;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;

public class Bachelor extends Student{
    public Bachelor(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, int yearOfStudy) {
        super(id, email, password, firstName, lastName, phoneNumber, gender, familyStatus, yearOfStudy);
    }

    public Bachelor(Long id, String email, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus) {
        super(id, email, password, firstName, lastName, phoneNumber, gender, familyStatus);
    }
    public Bachelor(String email, String password) {
        super(email, password);
    }
    public void getInfo(){
        System.out.print(email+password);
    }
    @Override
    public String getView() {
        return ("1: For checking schedule \n2:For log out");
    }

    @Override
    public String getSchedule() {
        return "Will be soon";
    }
}
