package _Top_100_Liked_Questions._13_Roman_to_Integer

// https://leetcode.com/problems/roman-to-integer/

//class Solution {
//
//    var values: MutableMap<String, Int> = HashMap()
//
//    fun romanToInt(s: String): Int {
//        values["M"] = 1000
//        values["D"] = 500
//        values["C"] = 100
//        values["L"] = 50
//        values["X"] = 10
//        values["V"] = 5
//        values["I"] = 1
//
//        val lastSymbol = s.substring(s.length - 1)
//        var lastValue = values[lastSymbol]!!
//        var total = lastValue
//        for (i in s.length - 2 downTo 0) {
//            val currentSymbol = s.substring(i, i + 1)
//            val currentValue = values[currentSymbol]!!
//            if (currentValue < lastValue) {
//                total -= currentValue
//            } else {
//                total += currentValue
//            }
//            lastValue = currentValue
//        }
//        return total
//    }
//}

//class Solution {
//
//    val romanMap = hashMapOf(
//        'I' to 1,
//        'V' to 5,
//        'X' to 10,
//        'L' to 50,
//        'C' to 100,
//        'D' to 500,
//        'M' to 1000
//    )
//
//    fun romanToInt(s: String): Int {
//        var value: Int
//        var lastValue = 0
//        var result = 0
//        s.forEach {
//            value = romanMap[it]!!
//            result += if (value <= lastValue) value
//            else value - 2 * lastValue
//            lastValue = value
//        }
//        return result
//    }
//
//}

class Solution {

    private val romanMap = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var value: Int
        var total = 0
        var lastValue = romanMap[s[s.length - 1]] ?: 0
        for (i in s.length - 1 downTo 0) {
            value = romanMap[s[i]] ?: 0
            if (value >= lastValue) total += value
            else total -= value
            lastValue = value
        }
        return total
    }

}

fun main() {
    val solution1 = Solution().romanToInt("III") // 3
    val solution2 = Solution().romanToInt("LVIII") // 58
    val solution3 = Solution().romanToInt("MCMXCIV") // 1994

    println(solution1)
    println(solution2)
    println(solution3)
}