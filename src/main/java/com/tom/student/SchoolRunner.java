package com.tom.student;

import java.util.Scanner;
//import com.tom.student.Student;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu= new Student("Tom",77,66);
        Student stu1= new Student("Eric",60,40);
        stu.print();
        stu1.print();
        GraduateStudent gstu= new GraduateStudent("Jack",62,65,61);
        gstu.print();
        System.out.println("highest score: "+ stu.highest());
    }

    private static void userInput() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter student's name:");
        String name= scanner.next();
        System.out.print("Please enter student's english:");
        int english= scanner.nextInt();
        System.out.print("Please enter student's math:");
        int math= scanner.nextInt();

        Student stu= new Student(name,english,math);
        stu.print();
        System.out.println("highest score: "+ stu.highest());
    }
}
