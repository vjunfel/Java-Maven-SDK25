package com.junfel.exercises.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    // #Method Overloading
    // Method 1 - (filePath, TextToWrite)
    public static void write(String filePath, String textToWrite) {

        // This format is manually close
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(textToWrite);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    // Method 2 - (filePath, TextToWrite, append)
    public static void write(String filePath, String textToWrite, boolean append) {

        // This format is auto-close (Recommended)
        try (FileWriter writer = new FileWriter(filePath, append)) {
            writer.write(textToWrite);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
