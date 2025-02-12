package org.example.com.QueueInterface.HospitalTriageSystem;
import java.util.*;

//patient class
class Patient {
    String name;
    int severity;

    //constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + ", Severity-> " + severity;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        //custom comparator to sort patients by severity - highest first
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                //descending order
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        //adding patients
        triageQueue.add(new Patient("Subha", 3));
        triageQueue.add(new Patient("Riya", 5));
        triageQueue.add(new Patient("Priya", 2));

        //processing patients in order of severity
        while (!triageQueue.isEmpty()) {
            System.out.println("Treating: " + triageQueue.poll());
        }
    }
}
