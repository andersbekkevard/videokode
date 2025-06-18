package innkapsling_2;

import innkapsling_1.Student;

public class MainOutsidePackage {
    
    public static void main(String[] args) {
    
        Student student = new Student();

        // student.nickname = "Nytt Kallenavn";

        System.out.println(student.getRealName());

    }

}
