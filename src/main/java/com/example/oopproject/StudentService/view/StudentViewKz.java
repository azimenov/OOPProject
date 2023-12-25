import java.util.Scanner;

public class StudentView {
    private final StudentController studentController;
    private final Scanner scanner;

    public StudentView(StudentController studentController, Scanner scanner) {
        this.studentController = studentController;
        this.scanner = scanner;
    }

    private void displayKazakhView() {
       System.out.println("Жүйеге қош келдіңіз");
        System.out.println("1. Курстарды шолу");
        System.out.println("2. Мұғалімдерді шолу");
        System.out.println("3. Бағаларды шолу");
    }

    public void seeCourses() {
        System.out.println("Сіздің курстарыңыз:");
        HashSet<String> courses = studentController.getAllCourses(student);
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void viewInfoAboutTeacher() {
        System.out.print("Курс атын енгізіңіз: ");
        String courseName = scanner.nextLine();

        String teacherInfo = studentController.viewInfoAboutTeacher(student, courseName);
        if (teacherInfo != null) {
            System.out.println(teacherInfo);
        } else {
            System.out.println("Бұл курс үшін мұғалім туралы ақпарат табылмады.");
        }
    }

    public void viewMarks() {
        System.out.println("Сіздің бағаларыңыз:");
        Vector<Mark> marks = studentController.viewMarks(student);
        for (Mark mark : marks) {
            System.out.println(mark);
        }
    }
}