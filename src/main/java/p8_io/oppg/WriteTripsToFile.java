package p8_io.oppg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.List;

public class WriteTripsToFile {

	/**
	 * Writes the content of a {@link TripManager} to
	 * the provided {@link OutputStream}.
	 * 
	 * The method generates a string representation of the TripManagers trups
	 * 
	 * Each attribute is to be separated by a semicolon, and each trip
	 * to be separated by a blank line.
	 * The generated string is then written to the provided OutputStream.
	 * 
	 * The format of the output should be as follows:
	 * 
	 * <pre>
	 *  id;name;email
	 *  destination;startDate;endDate
	 *  budget
	 * </pre>
	 * 
	 * @param tripManager  The {@link TripManager} object. Assume it is not null
	 * @param outputStream The {@link OutputStream} to which the trips will be
	 *                     written
	 * @throws IOException If an I/O error occurs when writing to the stream.
	 * 
	 * @see TripManager
	 * @see Trip
	 */

	public static void write(TripManager tripManager, OutputStream outputStream) throws IOException {
		// HUSK Å BEGYNNE LØSNINGEN UTEN THROWS IOEXCEPTION
		for (Trip t : tripManager.getTrips()) {
			StringBuilder sb = new StringBuilder();
			sb.append(t.id() + ";" + t.name() + ";" + t.email() + "\n");
			sb.append(t.destination() + ";" + t.startDate() + ";" + t.endDate() + "\n");
			sb.append(t.budget() + "\n");
			sb.append("\n");
			outputStream.write(sb.toString().getBytes());
		}
		outputStream.flush();
		outputStream.close();
	}

	public static void main(String[] args) {

		List<Trip> trips = List.of(
				new Trip("T101", "Otto", "otto@ntnu.com", "Paris",
						LocalDate.of(2024, 6, 12), LocalDate.of(2024, 6, 18), 12000),
				new Trip("T102", "Anna", "anna@ntnu.com", "Roma",
						LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 7), 9500));

		TripManager tripManager = new TripManager(trips);

		try (OutputStream outputStream = new FileOutputStream("files/trips.txt")) {
			WriteTripsToFile.write(tripManager, outputStream);
		} catch (Exception e) {
			System.err.println("Feil oppstått: " + e.getMessage());
		}
	}

}
