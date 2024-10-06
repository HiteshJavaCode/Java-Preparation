package com.regex;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        // Regular expression to validate an email address
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        // Input string to validate
        String email = "test.email@example.com";

        // Compiling the pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher to check the input string
        Matcher matcher = pattern.matcher(email);

        // Checking if the input string matches the regex
        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }
}
