package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.predicate;

public class Candidate {
    
    private String name;
    private String program;
    private int year;

    public Candidate(String name, String program, int year) {
        this.name = name;
        this.program = program;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

}
