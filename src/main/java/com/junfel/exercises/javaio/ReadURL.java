package com.junfel.exercises.javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadURL {

    public static void read(String networkURL) throws IOException {

        URL url = new URL(networkURL);

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

    }

}
