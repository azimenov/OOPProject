package com.example.oopproject.TeacherService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.repository.TeacherRepositoryImpl;

import java.util.*;

public class TeacherController extends EmployeeController {
    private TeacherRepositoryImpl teacherRepository;

    public TeacherController(EmployeeRepositoryImpl employeeRepository, TeacherRepositoryImpl teacherRepository) {
        super(employeeRepository);
        this.teacherRepository = teacherRepository;
    }

    /**
     * Retrieves students from a specific group for a given course.
     * @param teacher The Teacher object.
     * @param courseName The name of the course.
     * @return A list of students in the specified group for the course.
     */
    public List<Student> getStudentsFromGroup(Teacher teacher, String courseName){
        return teacher.getGroups().stream()
                .filter(group -> group.getCourse().getName().equals(courseName))
                .findFirst()
                .orElseThrow() // Handle NoSuchElementException if group not found
                .getStudents();
    }

    /**
     * Retrieves all courses taught by the teacher.
     * @param teacher The Teacher object.
     * @return A set of course names taught by the teacher.
     */
    public Set<String> getAllCourses(Teacher teacher){
        Set<String> result = new HashSet<>();
        for(Group group: teacher.getGroups()){
            result.add(group.getCourse().getName());
        }
        return result;
    }

    /**
     * Retrieves all students grouped by course taught by the teacher.
     * @param teacher The Teacher object.
     * @return A map containing course names as keys and vectors of students as values.
     */
    public Map<String, Vector<Student>> getAllStudents(Teacher teacher){
        Map<String, Vector<Student>> students = new HashMap<>();

        for(Group group: teacher.getGroups()){
            students.put(group.getCourse().getName(), group.getStudents());
        }

        return students;
    }

    /**
     * Sets a mark for a student in a specific course taught by the teacher.
     * @param teacher The Teacher object.
     * @param email The email of the student.
     * @param mark The Mark object containing the mark details.
     */
    public void setMark(Teacher teacher, String email, Mark mark){
        for(Group group: teacher.getGroups()){
            for(Student student: group.getStudents()){
                if(student.getEmail().equals(email) && group.getCourse().getName().equals(mark.getCourseName())){
                    student.addMark(mark);
                }
            }
        }
    }
}
