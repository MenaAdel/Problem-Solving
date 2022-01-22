package com.mena.problemsolving

import android.util.Log
import java.text.SimpleDateFormat

/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int): String {

    var sum = 31 + dayInFeb(year) + 31 + 30 + 31 + 30 + 31 + 31
    var programmerDay = 256 - sum
    var programmerDayStr = ""
    if(programmerDay>9)
     programmerDayStr = "$programmerDay" else "0$programmerDay"
    return "${programmerDayStr}.09.${year}"
}

fun dayInFeb(year: Int): Int {
    return if (year ==1918) {
        15
    } else if (year < 1918){
        if (year % 4 == 0){
            29
        } else {
            28
        }
    } else {
        when {
            year % 400 == 0 -> 29
            year % 100 == 0 -> 28
            year % 4 == 0 -> 29
            else -> 28
        }
    }

}

fun main(args: Array<String>) {
   // val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(2017)

    println(result)
}
