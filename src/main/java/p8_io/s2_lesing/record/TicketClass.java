package p8_io.s2_lesing.record;

import java.time.LocalDateTime;
import java.util.List;

public class TicketClass {

    // Start med feltene og konstruktøren inne
    // "Vi vil holde styr over billetter. Vi trenger egt bare sette dem når vi oppretter billetten, så vi trenger ikke endre på dem
    // men vi vil gjerne kunne lese av innholdet til enhver til. Lignende tilfeller med behov for å kunne hente men ikke sette verdier er ganske typiske"
    // Må generere getterne for å hente ut verdiene (med source action)
    // "Vi legger også merke til at klassen ikke har noe funksjonalitet uover å sette og hente data. 
    // Det er egt bare en datacontainer" 
    
    // Fjern gettere. Gjør public og add final. 
    // Dette er ganske likt. Verdiene kan settes 
    // For eksempel må List peke til samme liste. MEN listens innhold kan endres som vi vil!! Siden private List<String> phonenumbers; settes som en endelig peker, er fortsatt verdiene inneholdt
    // i listen frie til å endres!!

    // Gå over til record. Opprett ny fil så du viser hvilke alternativer man har når man oppretter en fil

    private String id;
    private String name;
    private String email;
    private List<String> phonenumbers;
    private LocalDateTime time;

    public TicketClass(String id, String name, String email, List<String> phonenumbers, LocalDateTime time) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenumbers = phonenumbers;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }   

    public List<String> getPhonenumbers() {
        return phonenumbers;
    }

    public LocalDateTime getTime() {
        return time;
    }

}
