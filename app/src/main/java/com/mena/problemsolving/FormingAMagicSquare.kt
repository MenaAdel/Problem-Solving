package com.mena.problemsolving

import kotlin.io.*
import kotlin.math.abs

/*
 * Complete the 'formingMagicSquare' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY s as parameter.
 */

val global: Array<Array<Array<Int>>> = arrayOf(
    arrayOf(arrayOf(4, 3, 8), arrayOf(9, 5, 1), arrayOf(2, 7, 6)),
    arrayOf(arrayOf(2, 7, 6), arrayOf(9, 5, 1), arrayOf(4, 3, 8)),
    arrayOf(arrayOf(8, 3, 4), arrayOf(1, 5, 9), arrayOf(6, 7, 2)),
    arrayOf(arrayOf(6, 7, 2), arrayOf(1, 5, 9), arrayOf(8, 3, 4)),
    arrayOf(arrayOf(6, 1, 8), arrayOf(7, 5, 3), arrayOf(2, 9, 4)),
    arrayOf(arrayOf(2, 9, 4), arrayOf(7, 5, 3), arrayOf(6, 1, 8)),
    arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 6)),
    arrayOf(arrayOf(8, 1, 6), arrayOf(3, 5, 7), arrayOf(4, 9, 2))
)


fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var result = 10000
    var temp = 0
    global.forEach {
        temp = sub(it ,s)
        if (temp < result){
             result = temp
        }
    }
    return result
}

fun sub(subGlobal: Array<Array<Int>> ,s: Array<Array<Int>>): Int {
    var sum = 0
    for (i in s.indices){
        for (j in s.indices){
            sum += Math.abs(s[i][j] - subGlobal[i][j])
        }
    }
    return sum
}


fun main() {

    val s: Array<Array<Int>> = arrayOf(arrayOf(4, 5, 8), arrayOf(2, 4, 1), arrayOf(1, 9, 7))
    val result = formingMagicSquare(s)

    println(result)
}
