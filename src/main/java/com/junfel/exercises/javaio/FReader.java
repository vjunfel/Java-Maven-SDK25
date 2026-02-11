package com.junfel.exercises.javaio;

import java.io.FileReader;
import java.io.IOException;

public class FReader {
    public static void read(String filePath) {

        try (FileReader reader = new FileReader(filePath)) {

            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
