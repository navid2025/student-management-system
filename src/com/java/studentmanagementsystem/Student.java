package com.java.studentmanagementsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Person {


    private int age;
    private List<Course> courses;

    public Student(String id, String name, int age) {
        super(id, name);
        this.age = age;
        courses = new ArrayList<>();
    }

    public void enrollCourse(Course course){
        courses.add(course);
        System.out.println("course is enrolled");
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", id=" + id +
                ", age=" + age +
                ", courses=" + Arrays.toString(courses.toArray()) +
                '}';
    }
}
