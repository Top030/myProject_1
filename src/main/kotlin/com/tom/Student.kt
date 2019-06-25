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
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}");
    }
    fun grading()= when(getAverage()){
        in 90..100-> 'A';
        in 80..89-> 'B';
        in 70..79-> 'C';
        in 60..69-> 'D';
        else-> 'F';
    }
    fun passOrFailed()= if(getAverage()>= 60) "PASS" else "FAILED";
    fun getAverage()= (english+math)/2;
    fun nameCheck()= name?.length;
    fun highest()= if(english> math) english else math;
}