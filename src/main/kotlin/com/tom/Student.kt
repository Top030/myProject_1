package com.kotlin
import java.util.*

fun main(args: Array<String>) {
    val scanner= Scanner(System.`in`);
//    print("Please enter student's name:");
//    var name= scanner.next();
    var name:String?= null;
    print("Please enter student's english:");
    var english= scanner.nextInt();
    print("Please enter student's math:");
    var math= scanner.nextInt();

    val stu= Student(name, english, math);
    stu.print();
    stu.nameCheck();
}

class Student(var name: String?,var english: Int,var math: Int){
    fun print(){
        var temp: String= name+ "\t"+ english+ "\t"+ math+ "\t"+ (english+math)/2;
        println(temp);
    }
    fun nameCheck(){
        println(name?.length)
    }
}