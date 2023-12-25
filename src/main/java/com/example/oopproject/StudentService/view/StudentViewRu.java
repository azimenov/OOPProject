import java.util.Scanner;

public class StudentView {
    private final StudentController studentController;
    private final Scanner scanner;

    public StudentView(StudentController studentController, Scanner scanner) {
        this.studentController = studentController;
        this.scanner = scanner;
    }

     private void displayRussianView() {
        System.out.println("Добро пожаловать в систему");
        System.out.println("1. Посмотреть курсы");
        System.out.println("2. Посмотреть учителей");
        System.out.println("3. Посмотреть оценки");

    }

    public void seeCourses() {
        System.out.println("Ваши курсы:");
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void viewInfoAboutTeacher() {
        System.out.print("Введите название курса: ");
        String courseName = scanner.nextLine();

        String teacherInfo = studentController.viewInfoAboutTeacher(student, courseName);
        if (teacherInfo != null) {
            System.out.println(teacherInfo);
        } else {
            System.out.println("Информация о преподавателе для этого курса не найдена.");
        }
    }

    public void viewMarks() {
        System.out.println("Ваши оценки:");
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}