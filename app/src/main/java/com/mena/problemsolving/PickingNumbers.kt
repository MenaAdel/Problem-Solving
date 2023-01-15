package com.mena.problemsolving

import kotlin.math.abs

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    var result = 0
    var count = 0
    a.sort()
    for (i in a.indices) {
        for (j in i + 1 until a.size) {
            if (abs(a[i] - a[j]) <= 1) {
                count++
            }
        }
        if (count > result)
            result = count
            count = 0

    }
    return result + 1
}

fun main() {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = pickingNumbers(a)

    println(result)
}
