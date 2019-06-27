package com.tom.student;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void highestScoreTest(){
        Student stu= new Student("Tom",60,80);
        Assertions.assertEquals(80,stu.highest());
    }

    @Test
    public void averageTest(){
        Student stu= new Student("Tom",60,80);
        Assertions.assertEquals((60+80)/2,stu.getAverage());
    }
}
