import java.util.Scanner;

public class StudentView {
    private final StudentController studentController;
    private final Scanner scanner;

    public StudentView(StudentController studentController, Scanner scanner) {
        this.studentController = studentController;
        this.scanner = scanner;
    }

    public void getDefaultView() {
        System.out.println("Welcome to system");
        System.out.println("1. View Courses");
        System.out.println("2. View Teachers");
        System.out.println("3. View Marks");
    }

    public void seeCourses() {
        System.out.println("Your Courses:");
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void viewInfoAboutTeacher() {
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        String teacherInfo = studentController.viewInfoAboutTeacher(student, courseName);
        if (teacherInfo != null) {
            System.out.println(teacherInfo);
        } else {
            System.out.println("Teacher information not found for this course.");
        }
    }

    public void viewMarks() {
        System.out.println("Your Marks:");
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}