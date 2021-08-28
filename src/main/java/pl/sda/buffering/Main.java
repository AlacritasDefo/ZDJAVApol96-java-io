package pl.sda.buffering;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("user.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
