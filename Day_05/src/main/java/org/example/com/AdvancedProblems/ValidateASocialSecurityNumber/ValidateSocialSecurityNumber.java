package org.example.com.AdvancedProblems.ValidateASocialSecurityNumber;

import java.util.regex.*;
import java.util.Scanner;

//main class
public class ValidateSocialSecurityNumber {
        public static void main(String[] args) {

            //Using scanner object for taking inputs
            Scanner sc = new Scanner(System.in);

            //Taking SSN as input
            System.out.println("Enter your SSN -> ");
            String ssn = sc.nextLine();
            sc.close();

            //Regex for SSN format-> XXX-XX-XXXX
            String regex = "^\\d{3}-\\d{2}-\\d{4}$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ssn);

            //Matcher matches the valid SSN
            if (matcher.matches()) {
                System.out.println(ssn + " is valid");
            } else {
                System.out.println(ssn + " is invalid");
            }
        }
    }

