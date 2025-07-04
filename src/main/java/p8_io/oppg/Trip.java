package p8_io.oppg;

import java.time.LocalDate;

public record Trip(String id, String name, String email, String destination, LocalDate startDate, LocalDate endDate, int budget) {
}