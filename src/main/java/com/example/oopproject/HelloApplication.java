package com.example.oopproject;

import com.example.oopproject.ManagerPackege.Manager;
import com.example.oopproject.ManagerPackege.ORManager;
import com.example.oopproject.ManagerPackege.SchoolManager;
import com.example.oopproject.TeacherPackage.Teacher;
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

public class HelloApplication {

    public static void main(String[] args) {
        DataBase db = new DataBase();
        Admin admin = new Admin(db);
        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Margulan", "Azimenov", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Kamila", "Yesirkepova", "+77077146503", Gender.Female, FamilyStatus.not_married, Role.Bachelor, Faculty.BS, 2));
        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Dias", "Djakupov", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Askar", "Oralxan", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Maxat", "Mukan", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Alina", "Dumanova", "+77077146503", Gender.Female, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Nursultan", "Mukhambetkaliev", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.SEPI, 2));


        boolean closed = false;
        while(!closed){
            Scanner sc = new Scanner(System.in);
            System.out.print("write email:");
            String email = sc.next();
            System.out.print("write password: ");
            String password = sc.next();
            User user = admin.userLogIn(email, password);
            if(user != null){
                Role role = user.chooseRole();
                if(role == Role.Bachelor){
                    Bachelor student = (Bachelor)user;
                    student.getView();
                }
                else if(role == Role.SchoolManager){
                    Manager schoolManager = (Manager) user;
                    schoolManager.getView();
                }
                else if(role == Role.OrManager){
                    Manager orManager= (Manager) user;
                    orManager.getView();
                }
                else if(role == Role.Teacher){
                    Teacher teacher = (Teacher) user;
                    teacher.getView();
                }
            }
        }
    }
}