package com.tom

fun main(args: Array<String>) {
//    println("Hello Kotlin");
//    Human().hello();
    val human = Human();
    human.hello();
}

class Human(){
    fun hello(){
        println("Hello Kotlin");
    }
}