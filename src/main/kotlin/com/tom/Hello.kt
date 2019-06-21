package com.tom

fun main(args: Array<String>) {
//    println("Hello kotlin");
//    Human().hello();
    val h= Human(66.5f,1.7f);
//    val h= Human(weight= 66.5f,height= 1.7f);
    h.hello();
    println(h.bmi());
//    test
}

class Human(var weight:Float,var height:Float,var name:String= ""){
    init {
        println("Test$weight")
    }
//    constructor(name:String,weight: Float,height: Float):this(weight,height){}

    fun bmi():Float{
        var bmi:Float = weight / (height*height);
        return bmi;
    }

    fun hello(){
        println("Hello human");
    }
}