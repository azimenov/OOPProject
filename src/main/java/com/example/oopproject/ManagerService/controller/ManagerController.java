package com.example.oopproject.ManagerService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.CourseService.repository.CourseRepositoryImpl;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.repository.TeacherRepositoryImpl;

/**
 * ManagerController class, extending from EmployeeController.
 * Manages operations related to student registration, course assignment, and course activation.
 */
public class ManagerController extends EmployeeController {
    // Repository for managing student-related data
    protected StudentRepositoryImpl studentRepository;

    // Repository for managing course-related data
    protected CourseRepositoryImpl courseRepository;

    // Repository for managing teacher-related data
    protected TeacherRepositoryImpl teacherRepository;

    /**
     * Constructor for ManagerController class.
     * Initializes repositories for employees, students, courses, and teachers.
     * @param repository EmployeeRepositoryImpl instance to manage employee data.
     * @param studentRepository StudentRepositoryImpl instance to manage student data.
     * @param courseRepository CourseRepositoryImpl instance to manage course data.
     * @param teacherRepository TeacherRepositoryImpl instance to manage teacher data.
     */
    public ManagerController(EmployeeRepositoryImpl repository, StudentRepositoryImpl studentRepository,
                             CourseRepositoryImpl courseRepository, TeacherRepositoryImpl teacherRepository) {
        super(repository);
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.teacherRepository = teacherRepository;
    }

    /**
     * Registers a student for a course based on email, course name, and group number.
     * Retrieves the necessary information from repositories to add the student to the course.
     * @param email Email of the student to be registered.
     * @param courseName Name of the course for registration.
     * @param groupNumber Group number for the course registration.
     */
    public void registerStudentForCourse(String email, String courseName, int groupNumber) {
        courseRepository.findActivatedCourseByCourseName(courseName)
                .getGroups().elementAt(groupNumber).addStudent(studentRepository.findStudentByEmail(email));
    }

    /**
     * Assigns a course to a teacher based on email, course name, and group number.
     * Utilizes repositories to find the necessary information and assigns the course to the teacher.
     * @param email Email of the teacher to whom the course will be assigned.
     * @param courseName Name of the course to be assigned.
     * @param groupNumber Group number for the course assignment.
     */
    public void assignCourseToTeacher(String email, String courseName, int groupNumber) {
        courseRepository.findActivatedCourseByCourseName(courseName)
                .assignTeacher(teacherRepository.findTeacherByEmail(email), groupNumber);
    }

    /**
     * Activates a course using the ActivatedCourses instance provided.
     * Utilizes the course repository to open/activate the course.
     * @param activatedCourses ActivatedCourses instance representing the course to be activated.
     */
    public void activateCourse(ActivatedCourses activatedCourses) {
        courseRepository.openCourse(activatedCourses);
    }
}
