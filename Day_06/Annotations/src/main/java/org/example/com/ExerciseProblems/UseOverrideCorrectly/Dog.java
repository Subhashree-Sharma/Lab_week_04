package org.example.com.ExerciseProblems.UseOverrideCorrectly;

//Dog class
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public static void main(String[] args) {
        Animal myDog = new Dog();
        //calls the overridden method in Dog class
        myDog.makeSound();
    }
}

