package com.junfel.exercises.javaio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class JavaNIO {
    public static void write(String filePath, String textToWrite) throws IOException {

        Path path = Path.of(filePath);

        Files.writeString(path, textToWrite,
                StandardOpenOption.CREATE
//                StandardOpenOption.APPEND
        );
    }


    public static void read(String filePath) throws IOException {

        System.out.println("---- JAVA NIO Reader ---- ");

        Path path = Path.of(filePath);

        List<String> lines = Files.readAllLines(path);

        lines.forEach(line -> System.out.println(line));

    }

}
