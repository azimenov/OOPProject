package manager;

import java.util.Vector;

public class SchoolManagerDecarator {
	private ManagerDecoratorType type;
	
	public SchoolManagerDecarator(ManagerDecoratorType type) {
        this.type = type;
    }
	
	
	public boolean assignCourseToTeacher(Teacher teacher, String courseCode) {
        Course c = Course.findCourse(courseCode);
        if (c != null && !teacher.getAllCourses().containsKey(c)) {
            teacher.addCourse(c);
            return true;
        }
        return false;
    }
	
	/**
     * Method, which returns certain Teacher by his ID in String representation
     * @param id
     * @return Teacher
     
    public Teacher viewTeacher(String id) {
    	Vector <Teacher> teachers = viewTeachers();
    	for(Teacher t : teachers) {
    		if (t.getId().getNumberID().equals(id)) {
    			return t;
    		}
    	}
    	return null;
    }
*/
	@Override
    public String toString() {
        return super.toString() + " " + this.type;
    }
}
