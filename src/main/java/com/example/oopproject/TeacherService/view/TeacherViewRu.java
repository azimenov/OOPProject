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

public class TeacherViewRu extends TeacherViewEn  {

    public TeacherViewRu(Teacher teacher, TeacherController teacherController) {
        super(teacher,teacherController);
    }

    public void getView() {
        System.out.println("Добро пожаловать в систему\n1.Просмотр сообщения\n2.Просмотр всех сообщений\n3.Отправить сообщение\n4.Просмотр предметов\n5.Просмотр студентов \n6.Выставление оценок");
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
        System.out.println("Введите Email: ");
        String email = sc.next();
        System.out.println("Введите сообщение здесь:");
        String theme = sc.next();

            System.out.println("Введите текстовое сообщение:");
        String text = sc.next();

        System.out.println("Введите Email:");
        String sender = sc.next();

        teacherController.sendMessage(new Message(theme, text, sender, false, LocalDateTime.now()), email);
        getView();
    }
    public void seeCourses() {
        System.out.println("Предметы, проводимые учителем:");
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
            System.out.println("Предмет: " + courseName);

            for (Student student : students) {
                System.out.println("ID Студента: " + student.getId() + ", Имя: " + student.getEmail());
                // Дополнительная информация о студенте, если нужно        }
                System.out.println();
            }
        }
    }

    public void putMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email студента:");
        String email = scanner.nextLine();
        System.out.println("Введите название дисциплины:");
        String courseName = scanner.nextLine();
        System.out.println("Оценка первой аттестации:");
        double attestation1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Оценка второй аттестации:");
        double attestation2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Оценка финального экзамен:");
        double finalExam = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите семестр (СЕМЕСТР_1, СЕМЕСТР_2, т.б):");
        Semester semester = Semester.valueOf(scanner.nextLine().toUpperCase());
        teacherController.setMark(teacher, email, new Mark(courseName, attestation1, attestation2, finalExam, semester));
    }

}
