package com.tom;

public class Person {

    private float weight;
    private float height;
    private String name;

    public void hello(){
        System.out.println("Hello person");
    }

    Person(){}
    public Person(float weight,float height){
        this.weight = weight;
        this.height = height;
    }
    public Person(String name,float weight,float height){
        this(weight,height);
        this.name = name;
    }

    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    }
}
