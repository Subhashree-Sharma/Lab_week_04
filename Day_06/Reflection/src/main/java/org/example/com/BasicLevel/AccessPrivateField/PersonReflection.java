package org.example.com.BasicLevel.AccessPrivateField;
import java.lang.reflect.Field;

//PersonReflection class
public class PersonReflection {

    //main method
    public static void main(String[] args) throws Exception{

        //creating a Person object
        Person person = new Person(21);
        System.out.println("Original age -> " + person.getAge());

        //modifying age
        Field newAge = Person.class.getDeclaredField("age");
        newAge.setAccessible(true);

        //Set newAge & Display
        newAge.set(person, 25);
        System.out.println("Modified age -> " + person.getAge());
    }
}
