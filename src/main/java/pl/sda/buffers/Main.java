package pl.sda.buffers;

import java.nio.CharBuffer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(6);
        String text = "test";
        for (Character character : text.toCharArray()) {
            buffer.put(character);
        }
        System.out.println("Elementy bufora " + Arrays.toString(buffer.array()));
    }
}
