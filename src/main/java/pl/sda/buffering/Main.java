package pl.sda.buffering;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("user.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("user_copy.txt"))) {
            String line = in.readLine();
            String nextline;
            while (line != null) {
                nextline = in.readLine();
                out.write(line);
                if (nextline != null) {
                    out.newLine();
                }
                line = nextline;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}