package com.junfel.exercises.busplatecoding;

import java.util.*;

public class JCFCodingApp {

    static List<BusDetails> mondayCoding = new ArrayList<>();
    static List<BusDetails> tuesdayCoding = new LinkedList<>();
    static List<BusDetails> wednesdayCoding = new Vector<>();
    static Set<BusDetails> thursdayCoding = new TreeSet<>(Comparator.comparing(Object::toString));
    static Deque<BusDetails> fridayCoding = new ArrayDeque<>();

    static int mondayCount, tuesdayCount, wednesdayCount, thursdayCount, fridayCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = 0;

        do {
            System.out.print("Enter bus name: ");
            String busName = scanner.nextLine();

            System.out.print("Enter plate number: ");
            String plateNo = scanner.nextLine().toUpperCase();

            System.out.print("Enter driver assigned: ");
            String driver = scanner.nextLine();

            char lastDigit = plateNo.charAt(plateNo.length() - 1);
            BusDetails entry;

            switch (lastDigit) {
                case '1', '2':
                    entry = new BusDetails(busName, plateNo, driver, "Monday");
                    mondayCoding.add(entry);
                    mondayCount++;
                    System.out.printf(
                            "The %s with plate number %s belongs to %s coding. Assigned driver is '%s'",
                            busName, plateNo, entry.getCodingDay(), driver
                    );
                    break;

                case '3', '4':
                    entry = new BusDetails(busName, plateNo, driver, "Tuesday");
                    tuesdayCoding.add(entry);
                    tuesdayCount++;
                    System.out.printf(
                            "The %s with plate number %s belongs to %s coding. Assigned driver is %s",
                            busName, plateNo, entry.getCodingDay(), driver
                    );
                    break;

                case '5', '6':
                    entry = new BusDetails(busName, plateNo, driver, "Wednesday");
                    wednesdayCoding.add(entry);
                    wednesdayCount++;
                    System.out.printf(
                            "The %s with plate number %s belongs to %s coding. Assigned driver is %s",
                            busName, plateNo, entry.getCodingDay(), driver
                    );
                    break;

                case '7', '8':
                    entry = new BusDetails(busName, plateNo, driver, "Thursday");
                    thursdayCoding.add(entry);
                    thursdayCount++;
                    System.out.printf(
                            "The %s with plate number %s belongs to %s coding. Assigned driver is %s",
                            busName, plateNo, entry.getCodingDay(), driver
                    );
                    break;

                case '9', '0':
                    entry = new BusDetails(busName, plateNo, driver, "Friday");
                    fridayCoding.add(entry);
                    fridayCount++;
                    System.out.printf(
                            "The %s with plate number %s belongs to %s coding. Assigned driver is %s",
                            busName, plateNo, entry.getCodingDay(), driver
                    );
                    break;

                default:
                    System.out.println("Invalid input. Try again.");
                    continue;
            }

            System.out.print("\nDo you want to continue [Y/N]? ");
            choice = scanner.nextLine().toUpperCase().charAt(0);

        } while (choice == 'Y');

        displayAll();

        System.out.println("-----------------------------------------");
        System.out.println("Result Counts");
        System.out.println("-----------------------------------------");
        System.out.println("Monday Coding: " +  mondayCount);
        System.out.println("Tuesday Coding: " +  tuesdayCount);
        System.out.println("Wednesday Coding: " +  wednesdayCount);
        System.out.println("Thursday Coding: " +  thursdayCount);
        System.out.println("Friday Coding: " +  fridayCount);

        scanner.close();
    }

    static void displayAll() {
        System.out.println("\n--- MONDAY (ArrayList | for-each) ---");
        for (BusDetails e : mondayCoding) {
            System.out.println(e);
        }

        System.out.println("\n--- TUESDAY (LinkedList | Iterator) ---");
        for (BusDetails busDetails : tuesdayCoding) {
            System.out.println(busDetails);
        }

        System.out.println("\n--- WEDNESDAY (Vector | for-each) ---");
        for (BusDetails e : wednesdayCoding) {
            System.out.println(e);
        }

        System.out.println("\n--- THURSDAY (TreeSet | Iterator) ---");
        for (BusDetails busDetails : thursdayCoding) {
            System.out.println(busDetails);
        }

        System.out.println("\n--- FRIDAY (ArrayDeque | for-each) ---");
        for (BusDetails e : fridayCoding) {
            System.out.println(e);
        }

    }

}