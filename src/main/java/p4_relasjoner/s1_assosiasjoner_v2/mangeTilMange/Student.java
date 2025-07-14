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
        StringBuilder sb = new StringBuilder();
        sb.append(name + ": ");
        for (Course c : courses) {
            sb.append(c.getCourseCode() + ", ");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Student s1 = new Student("Otto");
        Student s2 = new Student("Anna");
        Course c1 = new Course("TDT4100");
        Course c2 = new Course("TMA4135");

        // Legger til hva begge sider
        s1.addCourse(c1);
        s2.addCourse(c1);
        c2.addStudent(s2);
        c2.addStudent(s1);

        System.out.println("Fra studentenes side:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("\nFra fagenes side:");
        System.out.println(c1);
        System.out.println(c2);
    }

}