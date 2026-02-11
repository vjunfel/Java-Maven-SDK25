package com.junfel.exercises.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    // #Method Overloading
    // Method 1 - (filePath, TextToWrite)
    public static void write(String filePath, String textToWrite) throws IOException {

        // This format is manually close
        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath);
            writer.write(textToWrite);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            writer.close();
        }
    }

    // Method 2 - (filePath, TextToWrite, append)
    public static void write(String filePath, String textToWrite, boolean append) {

        // try-with-resources is auto-close (Recommended)
        try (FileWriter writer = new FileWriter(filePath, append)) {
            writer.write(textToWrite);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
