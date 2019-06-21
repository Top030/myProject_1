package com.tom.student

fun main(args: Array<String>) {
    val stu= Student("Andy",89,67);
    stu.print();
}

class Student(var name: String,var english: Int,var math: Int){
    fun print(){
        var temp: String= name+ "\t"+ english+ "\t"+ math+ "\t"+ (english+math)/2
        println(temp)
    }
}