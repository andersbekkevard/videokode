package p8_io.oppg;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadTripsFromFile {
    
    public static final String CSV_SPLIT_REGEX = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";

    /**
     * Parses a string containing product data into a {@link Trip} object.
     * 
     * The method expects the <code>tripLine</code> parameter to be a string with
     * values in a csv-format where each value represents a different attribute of the product. 
     * The <code>splitRegexp</code> parameter should be used to split the string into its parts.
     * 
     * If the string does not contain exactly 7 such values, or if any of the
     *  fields cannot be parsed, the method returns
     * <code>null</code>.
     *
     * @param tripLine A String containing the product data. It must contain
     *                    exactly four delimiter-separated values.
     * @param splitRegexp Regex expression to use for splitting the line.
     * 
     * @return A {@link Trip} object constructed from the provided data, or
     *         <code>null</code> if the data could not be parsed into a ComputerPart.
     * 
     * @see Trip
     */
    public static Trip parseLine(String tripLine, String splitRegexp) {
        String[] splittedLine = tripLine.split(splitRegexp);
        
        if (splittedLine.length != 7) {
            return null;
        }

        try {
            String id = splittedLine[0];
            String name = splittedLine[1];
            String email = splittedLine[2];
            String destination = splittedLine[3];
            LocalDate startDate = LocalDate.parse(splittedLine[4]);
            LocalDate endDate = LocalDate.parse(splittedLine[5]);
            int budget = Integer.parseInt(splittedLine[6]);

            return new Trip(id, name, email, destination, startDate, endDate, budget);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Reads the trips from the {@link InputStream} and returns a
     * {@link ResultSet} with Trips and errors.
     * 
     * The input stream is csv-formatted
     * The first line, a header line, should be skipped.
     * Every other line should be read as a {@link Trip} object and added
     * to the {@link ResultSet#trips()}. 
     * If a line cannot be parsed with the {@link #parseLine()} method, then the
     * line number of the error should instead be added to {@link ResultSet#errors()}
     * 
     * The {@link ReadTripsFromFile#CSV_SPLIT_REGEX} constant should be used to
     * split the lines
     *
     * The file trips.csv contains the file to be read
     *
     * @param {@link InputStream} containing the trips. Assume its not null.
     * @return A {@link ResultSet} object containing a list of parts and a list
     *         of line numbers for lines that could not be parsed.
     * @throws IOException If an I/O error occurs when reading from the stream.
     * 
     * @see ResultSet
     * @see Trip
     */
    public static ResultSet read(InputStream inputStream) throws IOException {
        // HUSK Å BEGYNNE LØSNINGEN UTEN THROWS IOEXCEPTION
        
        List<Trip> trips = new ArrayList<>();
        List<Integer> errors = new ArrayList<>();

        ResultSet result = new ResultSet(trips, errors);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        int lineNum = 1; 
        String line = reader.readLine(); // Første linje headere
        while ((line = reader.readLine()) != null) {
            lineNum++;
            Trip t = ReadTripsFromFile.parseLine(line, CSV_SPLIT_REGEX);
            if (t == null) {
                errors.add(lineNum);
            } else {
                trips.add(t);
            }
        }
        reader.close(); // Kan vise metoden hvor du heller putter i try with resources

        // try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
        //     int lineNum = 1; 
        //     String line = reader.readLine(); // Første linje headere
        //     while ((line = reader.readLine()) != null) {
        //         lineNum++;
        //         Trip t = ReadTripsFromFile.parseLine(line, CSV_SPLIT_REGEX);
        //         if (t == null) {
        //             errors.add(lineNum);
        //         } else {
        //             trips.add(t);
        //         }
        //     }
        // }


        return new ResultSet(trips, errors);
    }

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("src/main/java/p8_io/oppg/trips.csv")) {
            ResultSet set = ReadTripsFromFile.read(inputStream);
            set.trips().forEach(t -> System.out.println(t));
            set.errors().forEach(e -> System.out.println("Error on line: " + e));
        } catch (Exception e) {
            System.err.println("Feil: " + e.getMessage());
        }
    }

}
