package org.example.com.IntermediateLevel.RetrieveAnnotationsAtRuntime;

public class AnnotationRetriever {
    public static void main(String[] args) {
            //get Book class
            Class<?> bookClass = Book.class;

            //check if the @Author annotation is present
            if (bookClass.isAnnotationPresent(Author.class)) {
                //retrieve annotation
                Author author = bookClass.getAnnotation(Author.class);

                //display annotation value
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation found.");
            }

    }
}
