package p4_relasjoner.s1_assosiasjoner_v2.mangeTilMange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student {
    private String name;
    private Collection<Course> courses = new ArrayList<>();
    
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public Collection<Course> getCourses() {
        return List.copyOf(courses);
    }
    
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            if (!course.hasStudent(this)) {
                course.addStudent(this);
            }
        }
    }
    
    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            if (course.hasStudent(this)) {
                course.removeStudent(this);
            }
        }
    }
    
    public boolean hasCourse(Course course) {
        return courses.contains(course);
    }
    
    public int getCourseCount() {
        return courses.size();
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', courses=" + courses.size() + "}";
    }
}