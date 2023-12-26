package com.example.oopproject;

import com.example.oopproject.AdminService.controller.AdminController;
import com.example.oopproject.AdminService.repository.AdminRepository;
import com.example.oopproject.AdminService.repository.AdminRepositoryImpl;
import com.example.oopproject.CourseService.repository.CourseRepositoryImpl;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.ManagerService.controller.ManagerController;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.ManagerService.view.ManagerView;
import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.enums.Faculty;
import com.example.oopproject.StudentService.model.Bachelor;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;
import com.example.oopproject.StudentService.view.StudentViewEn;
import com.example.oopproject.StudentService.view.StudentViewKz;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.TeacherType;
import com.example.oopproject.TeacherService.controller.TeacherController;
import com.example.oopproject.TeacherService.repository.TeacherRepositoryImpl;
import com.example.oopproject.TeacherService.view.TeacherView;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import com.example.oopproject.AdminService.model.Admin;

import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;
import java.util.Vector;

public class HelloApplication {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataBase db = new DataBase();
        DataBase.deserialize();
        Admin admin = new Admin();
        AdminController adminController = new AdminController(new AdminRepositoryImpl(db));

        adminController.addUser(new Bachelor("22B030293", "qwerty123", "Margulan", "Azimenov", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));

        adminController.addUser(new Bachelor("22B030293",  "qwerty123", "Margulan", "Azimenov", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        adminController.addUser(new Bachelor("22B566788",  "qwerty123", "Kamila", "Yesirkepova", "+77077146503", Gender.Female, FamilyStatus.not_married, Role.Bachelor, Faculty.BS, 2));
        adminController.addUser(new Bachelor("22B657633",  "qwerty123", "Dias", "Djakupov", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        adminController.addUser(new Bachelor("22B456577",  "qwerty123", "Askar", "Oralxan", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        adminController.addUser(new Bachelor("22B234544",  "qwerty123", "Maxat", "Mukan", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        adminController.addUser(new Bachelor("22B040394",  "qwerty123", "Alina", "Dumanova", "+77077146503", Gender.Female, FamilyStatus.not_married, Role.Bachelor, Faculty.FIT, 2));
        adminController.addUser(new Bachelor("22B324567",  "qwerty123", "Nursultan", "Mukhambetkaliev", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.SEPI, 2));

        adminController.addUser(new Teacher(UUID.randomUUID().toString(),  "qwerty123", "Pakizar", "Shamoi", "+77077146503", Gender.Female, FamilyStatus.married, Role.Teacher, 100000,  TeacherType.LECTURE));
        adminController.addUser(new Teacher(UUID.randomUUID().toString(),  "qwerty123", "Nariman", "Ganiev", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Teacher, 100000,  TeacherType.TUTOR));

        adminController.addUser(new Bachelor(UUID.randomUUID().toString(),  "qwerty123", "Nariman", "Ganiev", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Bachelor, Faculty.SEPI, 2));
        adminController.addUser(new Manager(UUID.randomUUID().toString(),  "qwerty123", "Barak", "Obama", "+77077146503", Gender.Male, FamilyStatus.not_married, Role.Manager, 100000));
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Write email: ");
            String email = sc.next();
            System.out.println("Write password: ");
            String password = sc.next();
            if (password.equals("0")){
                db.serialize();
                break;
            }

            Vector<User> roles = db.userLogIn(email, password);
            System.out.println("Your roles: ");
            for(User user: roles){
                System.out.print(user.getRole() + " ");
            }
            System.out.print("Choose one: ");

            String option = sc.next();
            for(User user: roles){
                if(user instanceof Bachelor && option.equals("Bachelor")){
                    Bachelor bachelor = (Bachelor)user;
                    StudentViewEn studentView = new StudentViewEn(new StudentController(new StudentRepositoryImpl(db)), bachelor);
                    studentView.getDefaultView();
                }
                else if(user instanceof Teacher && option.equals("Teacher")){
                    Teacher teacher = (Teacher) user;
                    TeacherView view = new TeacherView(teacher, new TeacherController(new EmployeeRepositoryImpl(db), new TeacherRepositoryImpl(db)));
                    view.getView();
                }
                else if(user instanceof Manager && option.equals("M")){
                    Manager manager = (Manager) user;
                    ManagerView view = new ManagerView(manager, new ManagerController(new EmployeeRepositoryImpl(db), new StudentRepositoryImpl(db), new CourseRepositoryImpl(db), new TeacherRepositoryImpl(db)));
                    view.getView();
                }
            }
        }
    }
}