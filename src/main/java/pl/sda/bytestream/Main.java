package pl.sda.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("user.txt");
            FileOutputStream out = new FileOutputStream("user_copy.txt")) {
            int dataByteAsInt;
            while ((dataByteAsInt = in.read()) != -1) {
                char character = (char) dataByteAsInt;
                out.write(character);
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}