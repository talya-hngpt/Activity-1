package com.example.hingpit_activity1

fun main() {
    val grades = listOf(85, 42, 70, 58, 90)

    for (x in grades) {
        if (x >= 60) {
            println("$x is a passing grade")
        } else {
            println("$x is a failing grade")
        }
    }
}
