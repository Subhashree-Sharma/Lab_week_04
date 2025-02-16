package com.IntermediateLevelTest.RetrieveAnnotationsAtRuntimeTest;
import org.example.com.IntermediateLevel.RetrieveAnnotationsAtRuntime.Author;
import org.example.com.IntermediateLevel.RetrieveAnnotationsAtRuntime.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
class AuthorAnnotationTest {

    @Test
    void testRetrieveAuthorAnnotation() {
        //get the Book class
        Class<?> bookClass = Book.class;

        //check if annotation is present
        assertTrue(bookClass.isAnnotationPresent(Author.class));

        //retrieve annotation
        Author author = bookClass.getAnnotation(Author.class);

        //verify annotation value
        assertEquals("Subhashree Sharma", author.name());
    }
}
