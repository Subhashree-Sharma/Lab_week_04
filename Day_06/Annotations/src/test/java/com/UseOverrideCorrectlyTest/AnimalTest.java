package com.UseOverrideCorrectlyTest;
import org.example.com.ExerciseProblems.UseOverrideCorrectly.Animal;
import org.example.com.ExerciseProblems.UseOverrideCorrectly.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//AnimalTest class
class AnimalTest {

    @Test
    void testDogMakeSound() {
        //capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Animal dog = new Dog();
        dog.makeSound();

        //reset console output
        System.setOut(originalOut);

        //trim to avoid trailing spaces
        String actualOutput = outputStream.toString().trim();
        String expectedOutput = "Dog barks: Woof Woof!";

        //debugging line
        System.out.println("Captured Output: " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
}

