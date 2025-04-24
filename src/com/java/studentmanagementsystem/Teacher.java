package com.java.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String id;
    private String name;
    private List<Course> courseTaughts;

    public Teacher(String teacherId, String name) {
        this.id = teacherId;
        this.name = name;
        courseTaughts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourseTaughts() {
        return courseTaughts;
    }

    public void addCourse(Course course) {
        courseTaughts.add(course);
        System.out.println("course is added");
    }
}
