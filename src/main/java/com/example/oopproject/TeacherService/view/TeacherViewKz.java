package com.example.oopproject.TeacherService.view;

import com.example.oopproject.EmployeeService.view.Message;
import com.example.oopproject.StudentService.enums.Semester;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.controller.TeacherController;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class TeacherViewKz extends TeacherViewEn {

    public TeacherViewKz(Teacher teacher, TeacherController teacherController) {
        super(teacher,teacherController);
    }

    public void getView() {
        System.out.println("Жүйеге қош келдіңіз\n1.Хабарламаны қарау\n2.Барлық хабарламаларды қарау\n3.Хабарлама жіберу\n4.Пәндерді қарау\n5.Студенттерді қарау \n6.Баға қою");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();

        if (option == 1) {
            seeMessages();
        } else if (option == 2) {
            seeUnreadMessages();
        } else if (option == 3) {
            sendMessage();
        } else if (option == 4) {
            seeCourses();
        } else if (option == 5) {
            seeStudents();
        }
    }
    public void seeMessages(){
        for(Message message: teacherController.getUnreadMessages(teacher)){
            System.out.println(message);
        }
        getView();
    }
    public void seeUnreadMessages(){
        for(Message message: teacherController.getAllMessages(teacher)){
            System.out.println(message);
        }
        getView();
    }

    public void sendMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Email жазыңыз: ");
        String email = sc.next();
        System.out.println("Мұнда хабарламаны енгізіңіз:");
        String theme = sc.next();

        System.out.println("Мәтінді хабарламаны енгізіңіз:");
        String text = sc.next();

        System.out.println("Email жазыңыз:");
        String sender = sc.next();

        teacherController.sendMessage(new Message(theme, text, sender, false, LocalDateTime.now()), email);
        getView();
    }
    public void seeCourses() {
        System.out.println("Мұғалім жүргізетін пәндер:");
        for (String course : teacherController.getAllCourses(teacher)) {
            System.out.println(course);
        }
    }



    public void seeStudents() {
        Map<String, Vector<Student>> studentsByCourse = teacherController.getAllStudents(teacher);
        // Вывод студентов по курсам
        for (Map.Entry<String, Vector<Student>> entry : studentsByCourse.entrySet()) {
            String courseName = entry.getKey();
            Vector<Student> students = entry.getValue();
            System.out.println("Пән: " + courseName);

            for (Student student : students) {
                System.out.println("Студент ID-і: " + student.getId() + ", Аты: " + student.getEmail());
                // Дополнительная информация о студенте, если нужно        }
                System.out.println();
            }
        }
    }

    public void putMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Студент email-ын енгізіңіз:");
        String email = scanner.nextLine();
        System.out.println("Пән атауын енгізіңіз:");
        String courseName = scanner.nextLine();
        System.out.println("Бірінші аттестация бағасы:");
        double attestation1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Екінші аттестация бағасы:");
        double attestation2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Финалды экзамен бағасы:");
        double finalExam = Double.parseDouble(scanner.nextLine());
        System.out.println("Семестрді енгізіңіз (СЕМЕСТР_1, СЕМЕСТР_2, т.б):");
        Semester semester = Semester.valueOf(scanner.nextLine().toUpperCase());
        teacherController.setMark(teacher, email, new Mark(courseName, attestation1, attestation2, finalExam, semester));
    }

}
