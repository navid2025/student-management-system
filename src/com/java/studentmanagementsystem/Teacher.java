package com.java.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<Course> courseTaughts;


    public Teacher(String id, String name) {
        super(id, name);
        this.courseTaughts = new ArrayList<>();
    }

    public List<Course> getCourseTaughts() {
        return courseTaughts;
    }

    public void addCourse(Course course) {
        courseTaughts.add(course);
        System.out.println("course is added");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
