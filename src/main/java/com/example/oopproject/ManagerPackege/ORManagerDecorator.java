package manager;

import java.util.HashMap;
import java.util.Map;

public class ORManagerDecorator extends ManagerDecorator {
    private ManagerDecoratorType type;

    public ORManagerDecorator(ManagerDecoratorType type) {
        this.type = type;
    }

    public boolean registerForCourse(Student student, String courseCode, Teacher teacher) {
        Course c = Course.findCourse(courseCode);
        if (c != null && student.enrollCourse(c)) {
            if (!student.getAllCourses().containsKey(c)) {
                student.getAllCourses().put(c, new Mark());
                teacher.addStudent(c, student);
                return true;
            }
        }
        return false;
    }

    

    public boolean deleteFromCourse(Student student, String courseCode) {
        Course c = Course.findCourse(courseCode);
        HashMap<Course, Mark> allCourses = student.getAllCourses();
        for (Iterator<Map.Entry<Course, Mark>> iterator = allCourses.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<Course, Mark> entry = iterator.next();
            if (entry.getKey().equals(c)) {
                iterator.remove();
                student.setAllCourses(allCourses);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.type;
    }
}
