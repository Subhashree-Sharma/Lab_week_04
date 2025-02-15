package org.example.com.AdvancedProblems.ValidateAnIPAddress;

import java.util.Scanner;

//main class
    public class ValidateIPAddress {

        //Method to check valid IP address
        public static boolean isValidIP(String ip) {
            //Regex for IPv4 validation
            String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                    + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                    + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                    + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)$";

            //check if input matches regex
            return ip.matches(regex);
        }

        public static void main(String[] args) {
            //Using scanner for taking inputs
            Scanner sc = new Scanner(System.in);

            //Taking ip address as input
            System.out.println("Enter an IP address:");
            String ip = sc.nextLine();
            sc.close();

            //Display result
            if (isValidIP(ip)) {
                System.out.println(ip + " is a valid IPv4 address.");
            } else {
                System.out.println(ip + " is NOT a valid IPv4 address.");
            }
        }
    }
