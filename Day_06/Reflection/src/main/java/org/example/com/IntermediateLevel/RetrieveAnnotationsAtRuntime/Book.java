package org.example.com.IntermediateLevel.RetrieveAnnotationsAtRuntime;

//apply the custom @Author annotation to this class
@Author(name = "Subhashree Sharma")
public class Book {
    private String title;

    //constructor
    public Book(String title) {
        this.title = title;
    }

    //get title
    public String getTitle() {
        return title;
    }
}

