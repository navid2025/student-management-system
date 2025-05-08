package com.java.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course extends BaseItem {
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    public Course(String id, String courseName, Teacher teacher) {
        super(id);
        this.courseName = courseName;
        this.teacher = teacher;
        students = new ArrayList<>();
    }


    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", teacher=" + teacher +
                ", id='" + id + '\'' +
                '}';
    }
}
