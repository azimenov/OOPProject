package com.example.oopproject;

import com.example.oopproject.ManagerPackege.Manager;
import com.example.oopproject.ManagerPackege.ORManager;
import com.example.oopproject.ManagerPackege.SchoolManager;
import com.example.oopproject.TeacherPackage.Teacher;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.StudentTypes.Bachelor;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.db.Admin;

import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {

        Admin admin = new Admin();

        admin.addUser(new Bachelor("m_azimenov@kbtu.kz", "A2f3r5", Role.Bachelor));
        admin.addUser(new Bachelor("k_yesirkepova@kbtu.kz", "A2f3r5", Role.Bachelor));
        admin.addUser(new Bachelor("a_oralkhan@kbtu.kz", "A2f3r5", Role.Bachelor));
        admin.addUser(new Bachelor("d_djakupov@kbtu.kz", "A2f3r5", Role.Bachelor));

        admin.addUser(new Teacher("n_ganiev@kbtu.kz", "qwerty123", Role.Teacher));
        admin.addUser(new ORManager("a_aboba@kbtu.kz", "qwerty123", Role.SchoolManager, admin.getDB()));
        admin.addUser(new SchoolManager("b_aboba@kbtu.kz", "qwerty123", Role.OrManager, admin.getDB()));

        admin.addCourse(new Course("OOP", "1"));
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