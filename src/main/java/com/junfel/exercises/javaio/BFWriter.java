package com.junfel.exercises.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BFWriter {
    public static void write(String filePath, String textToWrite, boolean append) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, append))) {
            writer.write(textToWrite);
            writer.newLine();

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
