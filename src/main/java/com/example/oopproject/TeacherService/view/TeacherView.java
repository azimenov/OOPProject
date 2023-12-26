package com.example.oopproject.TeacherService.view;

import com.example.oopproject.EmployeeService.model.Message;
import com.example.oopproject.StudentService.enums.Semester;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.controller.TeacherController;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class TeacherView {
    protected Teacher teacher;
    protected TeacherController teacherController;


    public TeacherView(Teacher teacher, TeacherController teacherController) {
        this.teacher = teacher;
        this.teacherController = teacherController;
    }

    public void getView() {
        System.out.println("Welcome to system\n1.See messages\n2.See all messages\n3.Send Messages\n4.View Courses\n5.View students\n6.Put Marks");
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
        System.out.println("Write email: ");
        String email = sc.next();
        System.out.println("Enter message theme:");
        String theme = sc.next();

        System.out.println("Enter message text:");
        String text = sc.next();

        System.out.println("Enter your email:");
        String sender = sc.next();

        teacherController.sendMessage(new Message(theme, text, sender, false, LocalDateTime.now()), email);
        getView();
    }
    public void seeCourses() {
        System.out.println("Courses taught by the teacher:");
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
            System.out.println("Course: " + courseName);

            for (Student student : students) {
                System.out.println("Student ID: " + student.getId() + ", Name: " + student.getEmail());
                // Дополнительная информация о студенте, если нужно        }
                System.out.println();
            }
        }
    }

    public void putMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's email:");
        String email = scanner.nextLine();
        System.out.println("Enter course name:");
        String courseName = scanner.nextLine();
        System.out.println("Enter attestation 1 mark:");
        double attestation1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter attestation 2 mark:");
        double attestation2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter final exam mark:");
        double finalExam = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter semester (SEMESTER_1, SEMESTER_2, etc.):");
        Semester semester = Semester.valueOf(scanner.nextLine().toUpperCase());
        teacherController.setMark(teacher, email, new Mark(courseName, attestation1, attestation2, finalExam, semester));
    }

}
