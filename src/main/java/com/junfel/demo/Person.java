package com.junfel.demo;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person>{
    private String name;
    private String language;
    private int age;

    public Person(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


}
