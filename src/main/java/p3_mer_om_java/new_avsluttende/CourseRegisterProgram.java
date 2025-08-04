package p3_mer_om_java.new_avsluttende;

public class CourseRegisterProgram {

    public static void main(String[] args) {
        CourseRegister register = new CourseRegister();

        // Registrer noen studenter
        register.registerStudent("TDT4100", "Otto");
        register.registerStudent("TDT4100", "Anna");
        register.registerStudent("TMA4135", "Hans");
        register.registerStudent("TTM4100", "Anna");

        // Vis alle kurs
        System.out.println("Alle fag og dets studenter:");
        register.printAllCourses();

        // Tell studenter i et kurs
        System.out.println("\nAntall studenter i TDT4100: " + register.countStudents("TDT4100"));

        // Hent alle kurs for en student
        System.out.println("\nFag Anna er påmeldt: " + register.getCoursesOfStudent("Anna"));

        // Fjern en student
        System.out.println("\nFjern Anna fra TDT4100");
        boolean removed = register.removeStudent("TDT4100", "Anna");
        System.out.println("Vellykket fjerning? " + removed);

        // Fjern en siste student fra et kurs, som da fjernes helt
        System.out.println("\nFjern Anna fra TTM4100...");
        register.removeStudent("TTM4100", "Anna");

        // Vis oppdatert liste
        System.out.println("\nOppdaterte fag og dets studenter");
        register.printAllCourses();
    }

}
