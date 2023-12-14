package student;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class qqStudent {
 
 private Faculty faculty;
 private int yearOfStudy;
 private Organization member;
 private Transcript transcript;
 private List<Course> courses;

 
 public Student(Faculty faculty, int yearOfStudy, Organization member) {
     this.faculty = faculty;
     this.yearOfStudy = yearOfStudy;
     this.member = member;
     this.transcript = new Transcript();
     this.courses = new ArrayList<>();
 }


 public Faculty getFaculty() {
     return faculty;
 }

 public void setFaculty(Faculty faculty) {
     this.faculty = faculty;
 }

 public int getYearOfStudy() {
     return yearOfStudy;
 }

 public void setYearOfStudy(int yearOfStudy) {
     this.yearOfStudy = yearOfStudy;
 }

 public Organization getMember() {
     return member;
 }

 public void setMember(Organization member) {
     this.member = member;
 }
 public void addCourse(Course course) {
     courses.add(course);
 }

 public void viewCourses() {
     for (Course course : courses) {
         System.out.println(course.getName());
     }
 }

 public Transcript getTranscript() {
     return transcript;
 }

 public void setTranscript(Transcript transcript) {
     this.transcript = transcript;
 }


 public void registerForCourse(Teacher teacher, Course course) {
        teacher.addCourseToTeach(course);
        addCourse(course);
 }

 public String getTeacherInfo(Teacher teacher) {
  
     return "";
 }

 public void viewTranscript() {
  
 }

 public void viewFinancialInfo() {
     
 }

 public void rateTeacher(Teacher teacher, int rating) {
   
 }

 public void toRequest(Student student, String request) {
    
 }

 public void viewSchedules(Student student, Object undefined) {
  
 }

 public void fxRegister() {

 }

 public void willBeAssistant() {
    
 }

 public void viewFiles(Files files) {
     
 }

 public void viewExamSchedule(Object undefined) {
 
 }


 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Student student = (Student) obj;
     return yearOfStudy == student.yearOfStudy && Objects.equals(faculty, student.faculty) && Objects.equals(member, student.member);
 }


 public String toString() {
     return "Student{" +
             "faculty=" + faculty +
             ", yearOfStudy=" + yearOfStudy +
             ", member=" + member +
             '}';
 }
}





