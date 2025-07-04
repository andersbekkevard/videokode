package p4_relasjoner.s1_assosiasjoner_v2.mangeTilMange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Course {
    private String name;
    private String courseCode;
    private Collection<Student> students = new ArrayList<>();
    
    public Course(String courseCode, String name) {
        this.courseCode = courseCode;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public Collection<Student> getStudents() {
        return List.copyOf(students);
    }
    
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            if (!student.hasCourse(this)) {
                student.addCourse(this);
            }
        }
    }
    
    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            if (student.hasCourse(this)) {
                student.removeCourse(this);
            }
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
        return "Course{courseCode='" + courseCode + "', name='" + name + 
               "', students=" + students.size() + "}";
    }
    
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");
        
        Course math = new Course("MATH101", "Mathematics");
        Course physics = new Course("PHYS101", "Physics");
        Course chemistry = new Course("CHEM101", "Chemistry");
        
        System.out.println("=== Testing n-n Association (Wiki Approach) ===");
        System.out.println("Initial state:");
        System.out.println("Alice: " + alice);
        System.out.println("Bob: " + bob);
        System.out.println("Charlie: " + charlie);
        System.out.println("Math: " + math);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        
        alice.addCourse(math);
        alice.addCourse(physics);
        System.out.println("\nAfter alice.addCourse(math) and alice.addCourse(physics):");
        System.out.println("Alice: " + alice);
        System.out.println("Math: " + math);
        System.out.println("Physics: " + physics);
        
        math.addStudent(bob);
        math.addStudent(charlie);
        System.out.println("\nAfter math.addStudent(bob) and math.addStudent(charlie):");
        System.out.println("Bob: " + bob);
        System.out.println("Charlie: " + charlie);
        System.out.println("Math: " + math);
        
        bob.addCourse(chemistry);
        charlie.addCourse(physics);
        charlie.addCourse(chemistry);
        System.out.println("\nAfter additional course enrollments:");
        System.out.println("Bob: " + bob);
        System.out.println("Charlie: " + charlie);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        
        alice.removeCourse(math);
        System.out.println("\nAfter alice.removeCourse(math):");
        System.out.println("Alice: " + alice);
        System.out.println("Math: " + math);
        
        System.out.println("\nFinal enrollment summary:");
        System.out.println("Alice's courses: " + alice.getCourses().size());
        System.out.println("Bob's courses: " + bob.getCourses().size());
        System.out.println("Charlie's courses: " + charlie.getCourses().size());
        System.out.println("Math students: " + math.getStudents().size());
        System.out.println("Physics students: " + physics.getStudents().size());
        System.out.println("Chemistry students: " + chemistry.getStudents().size());
    }
}