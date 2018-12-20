package com.tom

fun main(args: Array<String>) {
    val human = Human(weight = 66.5f, height = 1.7f);
    human.hello();
    println(human.bmi());
    var a: Char = 'A';
    println(a.toInt() > 60);
}

class Human(var name: String = "", var weight: Float, var height: Float) {
    init {
        println("test weight:$weight,height:$height");
    }

    //    constructor(name: String, weight: Float, height: Float): this(weight, height);
    fun bmi(): Float {
        return weight / (height * height);
    }

    fun hello() {
        println("Hello Kotlin");
    }
}