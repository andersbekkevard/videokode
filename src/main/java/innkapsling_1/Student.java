package innkapsling_1;

public class Student {

    // Hvordan hindrer vi at alle kan endre på dataene våre direkte?
    // Innkapsling lar oss endre synligheten av elementene i en klasse utad,
    // og gir kontrollert tilgang gjennom metoder


    // Så langt har vi ikke brukt noen synlighetsmodifikator 
    // Oppretter først denne for å vise tilgangen man har fra samme og annen pakke
    String nickname = "Kalle Navn";

    // Adder så public for å gi tilgang utenfor pakken også
    // public String nickname = "Kalle Navn";
    
    // Vi legger til synlighetsmodifikatoren private for at denne ikke skal bli endra uten at vi vil 
    // String realName = "Ekte Navn";
    private String realName = "Ekte Navn";
    
    // private String getRealName() {
    //     return this.realname;
    // }

    public String getRealName() {
        return this.realName;
    }


    // Dette gir oss større sikkerhet om at objektet er i gyldig tilstand

}
