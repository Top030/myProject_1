package com.kotlin
import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Student("Jack", 77, 99);
    stu.print();
    println("highest score: ${stu.highest()}");
}

private fun userInput() {
    val scanner = Scanner(System.`in`);
//    print("Please enter student's name:");
//    var name= scanner.next();
    var name: String? = null;
    print("Please enter student's english:");
    var english = scanner.nextInt();
    print("Please enter student's math:");
    var math = scanner.nextInt();

    val stu = Student(name, english, math);
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
    fun highest(): Int{
//        var max= if(english>math){
//            println("english");
//            english
//        }else{
//            println("math")
//            math
//        }
//        return max;
        return (if(english> math) english else math);
    }
}