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
        FWriter.write(filePath, textToWrite);
        FWriter.write(filePath, textToWrite, true);


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
        FReader.read(fileToRead);


        // ***** Writing file using BufferedWriter *****
        String BFfileToWrite = "BFWriter.txt";
        String pathToSave = String.format("D:\\Accenture\\projects\\Uno-Java-Maven-JDK25\\src\\main\\resources\\%s", BFfileToWrite);
        String BFtextToWrite = "Write this using BufferedWriter";
        String BFtextToWrite2 = "This is another line of text";

        BFWriter.write(pathToSave, BFtextToWrite, false);
        BFWriter.write(pathToSave, BFtextToWrite2, true);


        // ***** Reading file using BufferedReader *****
        String BFfileToRead = "BFReader.txt";
        String BFfilePathToRead = String.format("D:\\Accenture\\projects\\Uno-Java-Maven-JDK25\\src\\main\\resources\\%s", BFfileToRead);

        BFReader.read(BFfilePathToRead);


        // ***** Writing and Reading file using Java NIO *****
        String NIOFilePath = "D:\\Accenture\\projects\\Uno-Java-Maven-JDK25\\src\\main\\resources\\JavaNIO.txt";
        String NIOTextToWrite = "\nWrite this using NIO.";

        // Writing File with Java NIO
        JavaNIO.write(NIOFilePath, NIOTextToWrite);

        // Reading File with Java NIO
        JavaNIO.read(NIOFilePath);

    }
}
