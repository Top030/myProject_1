package com.tom;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person("Tom",66.5f,1.7f);
        System.out.println(p.bmi());
        String s= "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,4));
    }
}
