package com.example.oopproject.TeacherService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.EmployeeService.view.Message;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.repository.TeacherRepositoryImpl;

import java.util.*;

public class TeacherController  {
    private EmployeeRepositoryImpl employeeRepository;
    private TeacherRepositoryImpl teacherRepository;

    public TeacherController(EmployeeRepositoryImpl employeeRepository, TeacherRepositoryImpl teacherRepository) {
        this.employeeRepository = employeeRepository;
        this.teacherRepository = teacherRepository;
    }

    public List<Student> getStudentsFromGroup(Teacher teacher, String courseName){
        return teacher.getGroups().stream().filter(group -> group.getCourse().getName().equals(courseName)).findFirst().get().getStudents();
    }
    public Set<String> getAllCourses(Teacher teacher){
        Set<String> result = new HashSet<>();
        for(Group group: teacher.getGroups()){
            result.add(group.getCourse().getName());
        }
        return result;
    }


    public Map<String, Vector<Student>> getAllStudents(Teacher teacher){
        Map<String, Vector<Student>> students = new HashMap<>();

        for(Group group: teacher.getGroups()){
            students.put(group.getCourse().getName(), group.getStudents());
        }

        return students;
    }

    public void setMark(Teacher teacher, String email, Mark mark){
        for(Group group: teacher.getGroups()){
            for(Student student: group.getStudents()){
                if(student.getEmail().equals(email) && group.getCourse().getName().equals(mark.getCourseName())){
                    student.addMark(mark);
                }
            }
        }
    }
    public void sendMessage(Message message, String email){
        employeeRepository.findEmployeeByEmail(email).addMessage(message);
    }
    public List<Message> getUnreadMessages(Teacher employee){
        return employee.getMessages().stream().filter(message -> message.getRead() == false).toList();
    }
    public List<Message> getAllMessages(Teacher employee){
        return employee.getMessages().stream().toList();
    }

}
