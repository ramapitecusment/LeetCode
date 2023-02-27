package _Top_100_Liked_Questions._12_Integer_to_Roman

import java.lang.StringBuilder

// https://leetcode.com/problems/integer-to-roman/

//class Solution {


//    fun intToRoman(num: Int): String {
//
//        var result = ""
//
//        val thousands = num / 1000
//        val hundreds = num % 1000 / 100
//        val tens = num % 100 / 10
//        val ones = num % 10
//
//        result = "$result${"M".repeat(thousands)}"
//
//        result = if (hundreds == 9) "${result}CM"
//        else if (hundreds > 5) "${result}${"D${"C".repeat(hundreds - 5)}"}"
//        else if (hundreds == 5) "${result}D"
//        else if (hundreds == 4) "${result}CD"
//        else "${result}${"C".repeat(hundreds)}"
//
//        result = if (tens == 9) "${result}XC"
//        else if (tens > 5) "${result}${"L${"X".repeat(tens - 5)}"}"
//        else if (tens == 5) "${result}L"
//        else if (tens == 4) "${result}XL"
//        else "${result}${"X".repeat(tens)}"
//
//        result = if (ones == 9) "${result}IX"
//        else if (ones > 5) "${result}${"V${"I".repeat(ones - 5)}"}"
//        else if (ones == 5) "${result}V"
//        else if (ones == 4) "${result}IV"
//        else "${result}${"I".repeat(ones)}"
//
//        return result
//    }

//    private val thousands = arrayOf("", "M", "MM", "MMM")
//    private val hundreds = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
//    private val tens = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
//    private val ones = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
//
//    fun intToRoman(num: Int): String =
//        thousands[num / 1000] + hundreds[num % 1000 / 100] + tens[num % 100 / 10] + ones[num % 10]

//}

class Solution {

    private val symbols = mapOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1,
    )

    fun intToRoman(num: Int): String {
        val builder = StringBuilder()
        var number = num
        symbols.forEach { (symbol, value) ->
            while (number >= value) {
                number -= value
                builder.append(symbol)
            }
        }
        return builder.toString()
    }
}

fun main() {
    val solution1 = Solution().intToRoman(3) // III
    val solution2 = Solution().intToRoman(58) // LVIII
    val solution3 = Solution().intToRoman(1994) // MCMXCIV

    println(solution1)
    println(solution2)
    println(solution3)
}