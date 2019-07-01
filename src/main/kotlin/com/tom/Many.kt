package com.tom

import java.time.LocalDateTime

fun main(args: Array<String>) {
  /*  val list= listOf(5,1,2,7)
    println(list)
    val scores= listOf(11,22,33,44,55)
    for(score in scores){
        println(score)
    }
    println(scores.get(3))
    val mutableList= mutableListOf(5,1,2,7)
    mutableList.add(6)
    println(mutableList)*/

    val parkingLot= HashMap<String,Car>()
    var enter=
            LocalDateTime.of(2019,7,1,8,0,0)
    var car:Car?= Car("AAA-0001",enter)
    parkingLot.put(car!!.id,car)
    car= Car("BBB-0002",enter.plusMinutes(15))
    parkingLot.put(car.id,car)
    //Car 1 leaving
    var leave=
            LocalDateTime.of(2019,7,1,9,0,0)
    car= parkingLot.get("AAA-0001")
    car?.leave= leave
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    //Car 2 leaving
    car= parkingLot.get("BBB-0002")
    car?.leave= leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
}