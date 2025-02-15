package org.example.com.TestingStringUtilityMethods;

//StringUtils class
public class StringUtils {

    //reverses the given string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //checks if the given string is a palindrome
    public boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }

    //converts the given string to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
