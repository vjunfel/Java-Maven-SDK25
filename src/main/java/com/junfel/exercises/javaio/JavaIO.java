package com.junfel.exercises.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class JavaIO {
    static void main() {


        String fileName = "test.csv";
        String filePath = String.format("D:\\Accenture\\projects\\Uno-Java-Maven-JDK25\\src\\main\\resources\\%s", fileName);
        String textToWrite = "ID,Name,Email,Age,Country\n" +
                "1,John Doe,john.doe@example.com,28,USA \n" +
                "2,Jane Smith,jane.smith@example.com,34,Canada \n" +
                "3,Michael Brown,michael.brown@example.com,45,UK \n";

        // *** Writing file using FileWriter ***

        // Instantiating writer - Option 1
        try (FileWriter writer = new FileWriter(filePath, false)) {
            writer.write(textToWrite);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Creating custom utility class Writer - Option 2
        Writer.write(filePath, textToWrite);
        Writer.write(filePath, textToWrite, true);

    }

}
