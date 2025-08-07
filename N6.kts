package com.example.hingpit_activity1

fun main() {
    val list = (1..10).toList()
    val reversedList = mutableListOf<Int>()

    for (i in list.size - 1 downTo 0) {
        reversedList.add(list[i])
    }

    println("Original list: $list")
    println("Reversed list: $reversedList")
}
