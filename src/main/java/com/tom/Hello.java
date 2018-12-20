package com.tom;

public class Hello {
    public static void main(String[] args) {
        Person person = new Person(66.5f, 1.7f);
        person.hello();
        System.out.println(person.bmi());
        char a = 'A';
        System.out.println(a > 60);
    }
}
