package com.example.myapplication

//membuat kondisional expresiion
//conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu dan menggunakan if-else, when, dan try-catch

fun ConditionalStatement(){
    println("=== Conditional Expresiion ===")

    //if-else
    val number = 10
    if (number > 0){
        println("positive number")
    }
    else {
        println("negative number")
    }

    // when
    val day = 1
    when (day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }
}