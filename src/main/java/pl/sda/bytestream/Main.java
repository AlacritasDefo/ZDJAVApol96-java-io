package pl.sda.bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("user.txt")) {
            int dataByteAsInt;
            while ((dataByteAsInt = in.read()) != -1) {
                byte[] bytes = {(byte) dataByteAsInt};
                String character = new String(bytes, StandardCharsets.UTF_8);
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
