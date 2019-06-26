package com.tom

import java.util.*

fun main(args: Array<String>) {
    val sc= Scanner(System.`in`)
    val secret= Random().nextInt(10)+ 1
    val max= 4
    println(secret)
    for(i in 1..max){
        print("Please enter a number(${i}/$max): ")
        var number= sc.nextInt()
        println("第${i}次: $number")
        if(number> secret){
            println("lower")
        }else if(number< secret){
            println("higher")
        }else{
            println("Great, the number is $number")
            break
        }
    }
}