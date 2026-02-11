package com.junfel.exercises.exception;

public class EmployeeValidation {
    public static void validateInput(Employee emp) throws InvalidUserDetailException {

        String name = emp.getName();
        int age = emp.getAge();
        String gender = emp.getGender();

        if (name.length() < 3) {
            throw new InvalidUserDetailException(
                    String.format("Invalid Employee name %s. Must be at least 3 characters", name)
            );
        }

        if (age < 18 || age > 65) {
            throw new InvalidUserDetailException("Invalid Employee age. Must be between 18 - 65 years old.");
        }

        if (!"Male".equalsIgnoreCase(gender) && !"Female".equalsIgnoreCase(gender)) {
            throw new InvalidUserDetailException("Invalid Employee gender. Only accepts either Male or Female.");
        }

        System.out.println("*** Employee Details ***");
        System.out.printf("Name=%s, Age=%s, Gender=%s", name, age, gender);

    }
}
