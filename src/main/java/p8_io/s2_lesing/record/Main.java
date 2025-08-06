package p8_io.s2_lesing.record;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Vi har en list av hver
    // Ser de dekker behovet vi har til dem på stort sett samme måte
    // Ikke noe hokkus pokkus!!!!

    public static void main(String[] args) {

        // Med klasse
        List<TicketClass> classTickets = new ArrayList<>();
        classTickets.add(new TicketClass("123", "Otto", "otto@ntnu.no", Arrays.asList("99887766"),
                LocalDateTime.of(2025, 1, 10, 14, 30, 20)));
        classTickets.add(new TicketClass("987", "Anna", "anna@ntnu.no", Arrays.asList("22334455", "98384853"),
                LocalDateTime.of(2025, 1, 11, 11, 30, 40)));

        classTickets.get(0).getId();
        classTickets.get(1).getPhonenumbers().add("11223344");

        // Med Records
        List<TicketRecord> recordTickets = new ArrayList<>();
        recordTickets.add(new TicketRecord("123", "Otto", "otto@ntnu.no", Arrays.asList("99887766"),
                LocalDateTime.of(2025, 1, 10, 14, 30, 20)));
        recordTickets.add(new TicketRecord("987", "Anna", "anna@ntnu.no", Arrays.asList("22334455", "98384853"),
                LocalDateTime.of(2025, 1, 11, 11, 30, 40)));

        recordTickets.get(0).id();
        recordTickets.get(1).phonenumbers().add("11223344");
    }
}
