package p4_relasjoner.s1_assosiasjoner_v2.mangeTilMange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Course {

    private String courseCode;
    private Collection<Student> students = new ArrayList<>();
    
    public Course(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public Collection<Student> getStudents() {
        return List.copyOf(students);
    }
    
    public void addStudent(Student student) {
        if (students.contains(student)) {
            return;
        }
        students.add(student);
        if (!student.hasCourse(this)) {
            student.addCourse(this);
        }

    }
    
    public void removeStudent(Student student) {
        if (!students.contains(student)) {
            return;
        }
        students.remove(student);
        if (student.hasCourse(this)) {
            student.removeCourse(this);
        }
    }
    
    public boolean hasStudent(Student student) {
        return students.contains(student);
    }
    
    public int getStudentCount() {
        return students.size();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(courseCode + ": ");
        for (Student s : students) {
            sb.append(s.getName() + ", ");
        }
        return sb.toString();
    }
    
}