package com.java.studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Manager studentManager = new Manager();

        while(true){
            System.out.println("***Student and Course Management System***");
            System.out.println("1: Add student");
            System.out.println("2: Add teacher");
            System.out.println("3: Add course");
            System.out.println("4: Enroll student in a course");
            System.out.println("5: view all students");
            System.out.println("6: view all courses");
            System.out.println("7: Exit");
            System.out.println("please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("please Enter your student id: ");
                    String id = scanner.nextLine();
                    System.out.println("please enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("please enter your age: ");
                    int age = scanner.nextInt();
                    Student student = new Student(id, name, age);
                    studentManager.addStudent(student);
                    break;
                case 2:
                    System.out.println("please Enter teacher id: ");
                    String teacherId = scanner.nextLine();
                    System.out.println("please enter your name: ");
                    String teacherName = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherId,teacherName);
                    studentManager.addTeacher(teacher);

                case 3:
                    System.out.println("please enter course id: ");
                    String courseId = scanner.nextLine();

                    System.out.println("please enter course name: ");
                    String courseName = scanner.nextLine();

                    System.out.println("please enter teacher id");
                    String tId = scanner.nextLine();


            }




        }

        //add student

        //add course

        //add teacher

        //enroll for a course

        //view all students

        //view all courses
    }
}
