package innkapsling_1;

public class Student {
    
    // Oppretter først denne for å vise tilgangen man har fra samme og annen pakke
    String nickname = "Kalle Navn";

    // Adder så public for å gi tilgang utenfor pakken også
    // public String nickname = "Kalle Navn";
    
    // Vi legger til synlighetsmodifikatoren private for at denne ikke skal bli endra uten at vi vil 
    String realName = "Ebenezer Scrooge";
    
    // private String getRealName() {
    //     return this.realname;
    // }

    public String getRealName() {
        return this.realName;
    }

}
