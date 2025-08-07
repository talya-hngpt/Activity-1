package com.example.hingpit_activity1

fun main(){
    val numbers = (1..20).toList()
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val doubledEvens = evenNumbers.map{ it * 2 }

    println("Here are the even numbers: $evenNumbers")
    println("Here are the doubled even: $doubledEvens")
}
