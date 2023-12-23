package com.example.oopproject;

import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.TeacherType;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import com.example.oopproject.StudentService.model.Bachelor;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.db.Admin;
import com.example.oopproject.StudentService.enums.Faculty;

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

        admin.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Nariman", "Ganiev", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.SEPI, 2));

        boolean closed = false;
        while(!closed){
            Scanner sc = new Scanner(System.in);
            System.out.print("write email:");
            String email = sc.next();
            System.out.print("write password: ");
            String password = sc.next();
            Vector<User> users = admin.userLogIn(email, password);
            if(users.size() > 0){
                for(User user: users){
                    System.out.print(user.getRole() + " ");
                }
                String option = sc.next();
                for(User user: users){
                    if(user instanceof Bachelor && option.equals("Bachelor")){
                        Bachelor bachelor = (Bachelor)user;
                        bachelor.getView();
                    }
                    else if(user instanceof Teacher && option.equals("Teacher")){
                        Teacher teacher = (Teacher) user;
                        teacher.getView();
                    }
                }

            }

        }
    }
}