    package com.example.hingpit_activity1

    fun main (){
        val mixedList: List<Any> = listOf(15, "Thalia", true, 3.14)
        //val mixedList = listOf(15, "Thalia", true, 3.14)

        for (item in mixedList) {
            when (item) {
                is Int -> println("Int: $item")
                is String -> println("String: $item")
                is Boolean -> println("Boolean value: $item")
                is Double -> println("Double: $item")
                else -> println("Unknown type")
            }
        }
    }
