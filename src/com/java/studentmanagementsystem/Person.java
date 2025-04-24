package com.java.studentmanagementsystem;

public class Person extends BaseItem {

    private String name;

    public Person(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
