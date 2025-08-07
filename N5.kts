package com.example.hingpit_activity1

fun calculator(x: Double, y: Double, operator: Char): Double {
    return when (operator) {
        '+' -> x + y
        '-' -> x - y
        '*' -> x * y
        '/' -> x / y
        else -> throw IllegalArgumentException("Invalid operator")
    }
}

fun main() {
    println(calculator(20.0, 5.0, '+'))
    println(calculator(20.0, 5.0, '-'))
    println(calculator(20.0, 5.0, '*'))
    println(calculator(20.0, 5.0, '/'))
}

