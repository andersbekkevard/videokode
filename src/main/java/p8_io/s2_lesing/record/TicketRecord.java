package p8_io.s2_lesing.record;

import java.time.LocalDateTime;
import java.util.List;

// Her velger vi record som type
// Så kan vi kopiere inn fra klassen og fjerne private
// Dette formatet er fint for lesbarhet
// Så kan vi putte alt på en linje
// "Dette er en måte vi kan dekke behovet vi hadde til ticket, som vi i klassen måtte bruke konstruktør og gettere for å dekke"
// Ser så på Main funksjon hvor de er like å benytte seg av

public record TicketRecord(String id, String name, String email, List<String> phonenumbers, LocalDateTime time) {
}
