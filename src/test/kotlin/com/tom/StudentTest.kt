package com.tom.kotlin

import com.kotlin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{

    @Test
    fun highestTest(){
        val stu= Student("Tom",60,80)
        Assertions.assertEquals(80,stu.highest())
    }

    @Test
    fun averageTest(){
        val stu= Student("Tom",60,80)
        Assertions.assertEquals((60+80)/2,stu.getAverage())
    }

    @Test
    fun gradingTest(){
        val stu= Student("Tom",60,80)
        Assertions.assertEquals('C',stu.grading())
    }
}