package com.tom.student;

public class Student {
    String name;
    String id;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        String temp=  name+ "\t"+ english +"\t" +math +"\t"+ (english+math)/2;
        System.out.println(temp);
    }
}
