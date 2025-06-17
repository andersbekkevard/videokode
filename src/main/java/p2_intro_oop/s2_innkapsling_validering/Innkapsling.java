package p2_intro_oop.s2_innkapsling_validering;

public class Innkapsling {
    
    String password = "data123";
    
    public String openPassword = "objektErKonge";
    
    private String secretPassword = "hemmelig";

    public String getSecretPassword() {
        return secretPassword;
    }

}
