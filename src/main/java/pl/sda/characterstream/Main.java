package pl.sda.characterstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("user.txt")) {
            int dataByteAsInt;
            while ((dataByteAsInt = reader.read()) != -1) {
                byte[] bytes = {(byte) dataByteAsInt};
                String character = new String(bytes, StandardCharsets.UTF_8);
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
