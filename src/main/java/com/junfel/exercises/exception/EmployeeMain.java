package com.junfel.exercises.exception;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try  {
            System.out.println(" *** Input Employee Details ***");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Gender: ");
            String gender = scanner.next();

            Employee emp = new Employee(name, age, gender);
            emp.setName(name);
            emp.setAge(age);
            emp.setGender(gender);

            EmployeeValidation.validateInput(emp);

        } catch(Exception e){
            System.out.println("Exception Error: " + e.getMessage());
        } finally{
            scanner.close();
        }
    }
}
