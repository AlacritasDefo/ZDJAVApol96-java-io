package pl.sda.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("user.txt")) {
            int dataByteAsInt;
            while ((dataByteAsInt = in.read()) != -1) {
                char character = (char) dataByteAsInt;
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
