package com.java.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Student> students;
    List<Course> courses;
    List<Teacher> teachers;

    public Manager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        teachers = new ArrayList<>();
    }
    public List<Student> getStudents(){
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void showAllStudent(){
        if(students.isEmpty()){
            System.out.println("No student available");
            return;
        }

        for(int i =0; i <students.size(); i++){
            System.out.println(students.get(i));
        }
    }

    public void showAllCourses(){
        if(courses.isEmpty()){
            System.out.println("No course available");
            return;
        }

        for (int i=0; i <courses.size(); i++){
            System.out.println(courses.get(i));
        }
    }

    public void studentEnroll(String studentId, String courseId){

        Student student = null;
        for (int i = 0; i< students.size(); i++){
            if(students.get(i).getId().equals(studentId)){
                student = students.get(i);
                break;
            }
        }

        //find course
        Course course = null;
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getId().equals(courseId)){
                course = courses.get(i);
            }
        }

        //add course to student and add student to course
        if(student != null && course != null){
            student.enrollCourse(course);
            course.addStudent(student);
        }else System.out.println("Course Id and/or studentId are invalid");

    }

}
