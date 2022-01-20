package com.mena.problemsolving

/*
 * Complete the 'divisibleSumPairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER_ARRAY ar
 */

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var counter = 0
    for (i in 0 until n) {
        for (j in 0 until n){
            if(i<j){
                if ((ar[i] + ar[j]) % k == 0)
                    counter ++
            }
        }
    }
    return counter
}
fun main(args: Array<String>) {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
