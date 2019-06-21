package com.tom;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person("Tom",66.5f,1.7f);
        System.out.println(p.bmi());
    }
}
