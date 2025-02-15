package org.example.com.TestingFileHandling;

import java.io.*;
import java.nio.file.*;

public class FileProcessor {

    // Writes content to a file
    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }

    // Reads content from a file
    public String readFromFile(String filename) throws IOException {
        return Files.readString(Paths.get(filename));
    }
}
