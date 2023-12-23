package com.example.oopproject;

import com.example.oopproject.ManagerPackege.Manager;
import com.example.oopproject.ManagerPackege.ORManager;
import com.example.oopproject.ManagerPackege.SchoolManager;
import com.example.oopproject.TeacherPackage.Teacher;
import com.example.oopproject.TeacherPackage.TeacherType;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;
import com.example.oopproject.student.StudentTypes.Bachelor;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.db.Admin;
import com.example.oopproject.student.enums.Faculty;

import java.util.Scanner;
import java.util.UUID;
import java.util.Vector;

public class HelloApplication {

    public static void main(String[] args) {
        DataBase db = new DataBase();
        Admin admin = new Admin(db);
        admin.addUser(new Bachelor("22B030293",  "qwerty123", "Margulan", "Azimenov", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor("22B566788",  "qwerty123", "Kamila", "Yesirkepova", "+77077146503", Gender.Female, FamilyStatus.not_married, Role.Bachelor, Faculty.BS, 2));
        admin.addUser(new Bachelor("22B657633",  "qwerty123", "Dias", "Djakupov", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor("22B456577",  "qwerty123", "Askar", "Oralxan", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor("22B234544",  "qwerty123", "Maxat", "Mukan", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor("22B040394",  "qwerty123", "Alina", "Dumanova", "+77077146503", Gender.Female, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor("22B324567",  "qwerty123", "Nursultan", "Mukhambetkaliev", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.SEPI, 2));

        admin.addUser(new Teacher(UUID.randomUUID().toString(),  "qwerty123", "Pakizar", "Shamoi", "+77077146503", Gender.Female, FamilyStatus.married, Role.Teacher, 100000, db, TeacherType.LECTURE));
        admin.addUser(new Teacher(UUID.randomUUID().toString(),  "qwerty123", "Nariman", "Ganiev", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Teacher, 100000, db, TeacherType.TUTOR));

        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Nariman", "Ganinev", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.SEPI, 2));

        boolean closed = false;
        while(!closed){
            Scanner sc = new Scanner(System.in);
            System.out.print("write email:");
            String email = sc.next();
            System.out.print("write password: ");
            String password = sc.next();
            Vector<User> roles = admin.userLogIn(email, password);
            if(roles.size() == 1){
                if(roles.elementAt(0) instanceof Bachelor){

                }
            }
        }
    }
}