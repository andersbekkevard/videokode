package p8_io.s2_lesing.read_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import p8_io.s1_skriving.write_text.Book;

public class Library {

    private List<Book> availableBooks = new ArrayList<>();

    public void scannerReadBooksFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Book newBook = this.getBook(line);
                availableBooks.add(newBook);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void bufferedReaderReadBooksFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Book newBook = this.getBook(line);
                availableBooks.add(newBook);
            }
        } catch (IOException e) {
            System.out.println("Feil i lesning av fil: " + e.getMessage());
        }
    }

    // For å løse denne må vi vite noe om hvordan linjene ser ut. Eller bør se ut
    public Book getBook(String lineInfo) {
        String[] splittedLine = lineInfo.split(","); // [title, author, year]
        String title = splittedLine[0];
        String author = splittedLine[1];
        int year = Integer.parseInt(splittedLine[2]);
        return new Book(title, author, year);
    }

    public static void main(String[] args) {
        Library library = new Library();

        String filename = "archivedBooks.txt";

        library.scannerReadBooksFromFile(filename);
        // library.bufferedReaderReadBooksFromFile(filename);

        for (Book b : library.availableBooks) {
            System.out.println(b.getTitle() + ", " + b.getAuthor() + ", " + b.getYear());
        }

    }

}
