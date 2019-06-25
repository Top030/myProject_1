package com.tom

import java.util.*

fun main(args: Array<String>) {
//    val sc= Scanner(System.`in`)
    val secret= Random().nextInt(10)+ 1
    println(secret)
    var number= 0
    while(number!= secret){
        print("Please enter a number: ")
//        number= sc.nextInt()
        number= readLine()!!.toInt()
        if(number> secret){
            println("lower")
        }else if(number< secret){
            println("higher")
        }else{
            println("Great, the number is $number")
        }
    }
}