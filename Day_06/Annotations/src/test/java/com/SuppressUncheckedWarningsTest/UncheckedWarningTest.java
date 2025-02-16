package com.SuppressUncheckedWarningsTest;
import org.example.com.ExerciseProblems.SuppressUncheckedWarnings.UncheckedWarning;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class UncheckedWarningTest {

    @Test
    //suppress warnings in test
    @SuppressWarnings("unchecked")
    public void testUncheckedList() {
        //now this method exists!
        ArrayList list = UncheckedWarning.createList();

        //checking the size
        assertEquals(3, list.size(), "List should have 3 elements");

        //checking the contents
        assertEquals("Hello", list.get(0));
        assertEquals(42, list.get(1));
        assertEquals(true, list.get(2));
    }
}

