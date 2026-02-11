package com.junfel.exercises.javaio;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void read(String filePath) {

        int character;
        try (FileReader reader = new FileReader(filePath)) {
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
