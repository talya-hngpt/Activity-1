package com.example.hingpit_activity1

fun main(){
    val numbers = listOf(1, 39, 43, 76, 8, 12, 23)
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("The largest number is: $max")
}
