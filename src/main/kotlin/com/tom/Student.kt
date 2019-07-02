package com.kotlin
import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Student("Jack", 77, 99)
    stu.print()
    println("highest score: ${stu.highest()}")
    Student.test()
    val gstu= GraduateStudent("Andy",61,65,63)
    gstu.print()
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

class GraduateStudent(name: String?,english: Int,math: Int,var thesis: Int): Student(name,english,math){
    companion object {
        var pass= 70
    }
    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}");
    }

    override fun passOrFailed() = if(getAverage()>= pass) "PASS" else "FAILED";
}

open class Student(var name: String?,var english: Int,var math: Int){
    companion object {
        @JvmStatic
        var pass= 60
        fun test(){
            println("testing")
        }
    }
    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}");
    }
    fun grading()= when(getAverage()){
        in 90..100-> 'A';
        in 80..89-> 'B';
        in 70..79-> 'C';
        in 60..69-> 'D';
        else-> 'F';
    }
    open fun passOrFailed()= if(getAverage()>= pass) "PASS" else "FAILED";
    fun getAverage()= (english+math)/2;
    fun nameCheck()= name?.length;
    fun highest()= if(english> math) english else math;
}