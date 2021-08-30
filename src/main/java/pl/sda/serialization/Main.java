package pl.sda.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(1,"Harry Potter","J.K. Rowling");
        try(FileOutputStream out = new FileOutputStream("book.txt");
            ObjectOutputStream obj = new ObjectOutputStream(out)) {
            obj.writeObject(book);
            obj.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
