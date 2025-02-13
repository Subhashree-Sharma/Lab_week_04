package org.example.com.Serialization_SaveAndRetrieveAnObject;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

//EmployeeSerialization class
public class EmployeeSerialization {
    private static final String FILE_NAME = "employees.ser";

    //Serialize employee list to file
    public static void saveEmployees(List<Employee> employees) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(employees);
            System.out.println("Employees saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }

    //deserialize employee list from file
    public static List<Employee> loadEmployees() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading employees: " + e.getMessage());
        }
        //return empty list if error occurs
        return new ArrayList<>();
    }

    public static void main(String[] args) {

        //list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Subhashree", "IT", 50000));
        employees.add(new Employee(2, "Riya", "IT", 60000));
        employees.add(new Employee(3, "Morris", "Finance", 55000));

        //serialize employee list
        saveEmployees(employees);

        //deserialize and display employees
        System.out.println("\nRetrieving Employees:");
        List<Employee> loadedEmployees = loadEmployees();
        loadedEmployees.forEach(Employee::display);
    }
}

