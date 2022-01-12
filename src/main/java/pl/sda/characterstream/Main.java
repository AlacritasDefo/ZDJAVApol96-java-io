package pl.sda.characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("user.txt");
            FileWriter writer = new FileWriter("user_copy.txt")) {
            int dataByteAsInt;
            while ((dataByteAsInt = reader.read()) != -1) {
                char character = (char) dataByteAsInt;

                writer.append(character);
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}