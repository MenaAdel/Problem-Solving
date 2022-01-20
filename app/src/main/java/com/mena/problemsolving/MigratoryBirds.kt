package com.mena.problemsolving

fun migratoryBirds(arr: Array<Int>): Int {
    val group = arr.groupBy { it }
    return group.filter { it.value.size == group.maxByOrNull { it.value.size }?.value?.size }
        .minByOrNull { it.key }?.key!!
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}