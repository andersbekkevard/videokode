package p4_relasjoner.UTDATERT_s1_assosiasjoner.mangeTilMange;

import java.util.ArrayList;
import java.util.List;

public class Student {
    
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addCourse(Course c) {
        if (!courses.contains(c)) { // Denne ser vi nå blir særlig viktig for å ikke få en evig loop
            courses.add(c);
            c.addParticipants(this);
        }
    }

    public void removeCourse(Course c) {
        courses.remove(c);
        c.removeParticipant(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + ": ");
        for (Course c : courses) {
            sb.append(c.getCourseName() + ", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Otto");
        Student s2 = new Student("Anna");
        Course c1 = new Course("TDT4100");
        Course c2 = new Course("TMA4135");
        s1.addCourse(c1);
        s1.addCourse(c2);
        c1.addParticipants(s2);
        c2.addParticipants(s2);

        System.out.println("Fra studentenes side:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("\nFra fagenes side:");
        System.out.println(c1);
        System.out.println(c2);
    }
}
