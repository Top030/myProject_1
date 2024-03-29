package com.tom

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    var counter= 1
    /*var ms= measureTimeMillis {
            for(n in 1..100_000) {
                thread {
                    counter++
                }
            }
    }
    //11044
    println(ms)*/

    var ms= measureTimeMillis {
        for(n in 1..100_000){
            GlobalScope.launch {
                counter++
            }
        }
    }
    //175
    println(ms)
}
