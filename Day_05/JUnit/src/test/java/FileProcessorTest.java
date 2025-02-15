import org.example.com.TestingFileHandling.FileProcessor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

public class FileProcessorTest {

    FileProcessor fileProcessor;
    String testFile = "testFile.txt";

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(testFile));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        fileProcessor.writeToFile(testFile, content);

        // Check if file exists
        assertTrue(Files.exists(Paths.get(testFile)));

        // Read and verify content
        String readContent = fileProcessor.readFromFile(testFile);
        assertEquals(content, readContent);
    }

    @Test
    void testReadNonExistentFile() {
        Exception exception = assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonExistent.txt"));
        assertTrue(exception.getMessage().contains("nonExistent.txt"));
    }
}
