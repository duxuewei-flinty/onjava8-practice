package com.duxuewei.onjava.io;
// iostreams/BufferedInputFile.java
// {VisuallyInspectOutput}

import java.io.*;
import java.nio.file.Files;
import java.util.stream.*;

public class BufferedInputFile {

    public static String read(String filename) {
        try (BufferedReader in = new BufferedReader(
                new FileReader(filename))) {
            return in.lines()
                    .collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.print(
                read("src/main/java/com/duxuewei/onjava/io/BufferedInputFile.java"));
    }


}
