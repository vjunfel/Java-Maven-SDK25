package com.junfel.demo;

import java.util.*;

public class ListDemo {
    static void main() {

        Person peter = new Person("Peter", "Python", 20);
        Person john = new Person("John", "Java", 23);
        Person james = new Person("James", "JavaScript, PHP", 25);

        List<Person> programmers = new LinkedList<>();
        programmers.add(james);
        programmers.add(peter);
        programmers.add(john);

        System.out.println("TEST -> " + james);
        System.out.println("TEST -> " + programmers);
        System.out.println("TEST -> " + programmers.get(0));
        System.out.println("TEST -> " + programmers.size());

        System.out.println("-------- List of Persons in ArrayList ---------");

        for (Person programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println("--------- List of Persons in HashSet ---------");

        Set<Person> programmerHashSet = new HashSet<>();
        programmerHashSet.add(peter);
        programmerHashSet.add(john);
        programmerHashSet.add(james);
        programmerHashSet.add(peter);

        for (Person prog : programmerHashSet) {
            System.out.print(prog.getName() + " - ");
            System.out.println(prog.getLanguage());
        }

        Set<Person> progTreeSet = new TreeSet<>();
        progTreeSet.add(peter);
        progTreeSet.add(john);
        progTreeSet.add(james);

        System.out.println("-------- List of Persons in TreeSet ---------");
        for (Person prog : progTreeSet) {
            System.out.println(prog);
        }
    }
}
