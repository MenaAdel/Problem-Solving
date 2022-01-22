package com.mena.problemsolving

/*
 * Complete the 'bonAppetit' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY bill
 *  2. INTEGER k
 *  3. INTEGER b
 */

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    var sum = 0
    bill.filterIndexed { index, i ->
        index != k
    }.forEach {
        sum += it
    }
    var actual = sum.div(2)
    if (actual == b){
        println("Bon Appetit")
    } else {
        println(Math.abs(b - actual))
    }

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
