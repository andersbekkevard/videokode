package p8_io.s1_skriving.write_text;

import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Archive {

    private List<Book> booksInArchive = new ArrayList<>();

    public void setBooksInArchive(List<Book> books) {
        this.booksInArchive = books;
    }

    public void writeBooksToFile(String filename) {
        // Skriv først bare writeren så ta try catch
        try {
            PrintWriter writer = new PrintWriter(filename);
            for (Book b : booksInArchive) {
                String newEntry = b.getTitle() + "," + b.getAuthor() + "," + b.getYear();
                writer.println(newEntry);
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void otherWriteBooksToFile(String filename) {
        // Skriv først vanlig som i funksjonen over. Så vis try-with-... (resources)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Book b : booksInArchive) {
                String newEntry = b.getTitle() + "," + b.getAuthor() + "," + b.getYear() + "\n";
                writer.write(newEntry);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        Archive archive = new Archive();

        List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("Victoria", "Knut Hamsun",1898),
            new Book("Prosessen", "Franz Kafka", 1925),
            new Book("Don Quijote", "Miguel de Cervante", 1605),
            new Book("En pingles dagbok", "Jeff Kinney", 2007);



        archive.setBooksInArchive(books);

        archive.writeBooksToFile("archivedBooks.txt");

        archive.otherWriteBooksToFile("otherArchivedBooks.txt");
        
    }

}
