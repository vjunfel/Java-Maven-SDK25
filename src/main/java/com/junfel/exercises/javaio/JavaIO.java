package com.junfel.exercises.javaio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIO {
    static void main() throws IOException {

        String fileName = "write.csv";
        String filePath = String.format("D:\\Accenture\\projects\\Uno-Java-Maven-JDK25\\src\\main\\resources\\%s", fileName);
        String textToWrite = "ID,Name,Email,Age,Country\n" +
                "1,John Doe,john.doe@example.com,28,USA \n" +
                "2,Jane Smith,jane.smith@example.com,34,Canada \n" +
                "3,Michael Brown,michael.brown@example.com,45,UK \n";

        // ***** Writing file using FileWriter *****

        // Instantiating FileWriter - Option 1
        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath, false);
            writer.write(textToWrite);
            writer.flush();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            writer.close();
        }

        // Custom utility class Writer - Option 2
        Writer.write(filePath, textToWrite);
        Writer.write(filePath, textToWrite, true);


        // ***** Reading file using FileReader *****

        // Instantiating FileReader - Option 1
        String file = "read.txt";
        String fileToRead = String.format("D:\\Accenture\\projects\\Uno-Java-Maven-JDK25\\src\\main\\resources\\%s", file);

        int character;
        FileReader reader = null;

        try {
            reader = new FileReader(fileToRead);
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        // Custom utility class Reader - Option 2
        System.out.println("\n--- Custom FileReader ---");
        Reader.read(fileToRead);

    }
}
