package org.example;

public class UserValidator {

    public void validateUser(String name, int age, String email) {
        boolean valid = true;

        if (name == null || name.trim().length() < 2) {
            System.out.println("Invalid name. Must be at least 2 characters.");
            valid = false;
        }

        if (age < 0 || age > 120) {
            System.out.println("Invalid age. Must be between 0 and 120.");
            valid = false;
        }

        if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email address.");
            valid = false;
        }

        if (valid) {
            System.out.println("User is valid: " + name + ", " + age + ", " + email);
        }
    }
}
