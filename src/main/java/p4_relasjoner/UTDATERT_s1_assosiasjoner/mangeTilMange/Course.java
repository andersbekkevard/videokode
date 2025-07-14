package p4_relasjoner.UTDATERT_s1_assosiasjoner.mangeTilMange;

import java.util.ArrayList;
import java.util.List;

public class Course {
    
    private String courseName;
    private List<Student> participants = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addParticipants(Student s) {
        if (!participants.contains(s)) {
            participants.add(s);
            s.addCourse(this);
        }
    }

    public void removeParticipant(Student s) {
        participants.remove(s);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(courseName + ": ");
        for (Student s : participants) {
            sb.append(s.getName() + ", ");
        }
        return sb.toString();
    }

}
