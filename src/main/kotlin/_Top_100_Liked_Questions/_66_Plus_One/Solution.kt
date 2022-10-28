package _Top_100_Liked_Questions._66_Plus_One

// https://leetcode.com/problems/plus-one/

class Solution {
//    fun plusOne(digits: IntArray): IntArray {
//        val result: IntArray
//        var remainder = 1
//
//        for (i in digits.size - 1 downTo 0) {
//            digits[i] += remainder
//            if (digits[i] > 9) {
//                remainder = 1
//                digits[i] = digits[i] % 10
//            } else remainder = 0
//        }
//
//        if (remainder == 1) {
//            result = digits.copyOf(digits.size + 1)
//            result[0] = remainder
//            return result
//        }
//
//        return digits
//    }

    fun plusOne(digits: IntArray): IntArray {

        for (i in digits.size - 1 downTo 0) {
            if (digits[i] == 9) digits[i] = 0
            else {
                digits[i]++
                return digits
            }
        }

        val result: IntArray = digits.copyOf(digits.size + 1)
        result[0] = 1
        return result
    }
}

fun main() {
    val solution1 = Solution().plusOne(intArrayOf(1, 2, 3))
    val solution2 = Solution().plusOne(intArrayOf(4, 3, 2, 1))
    val solution3 = Solution().plusOne(intArrayOf(9))
    val solution4 = Solution().plusOne(intArrayOf(9, 9, 9))

    println(solution1.toList())
    println(solution2.toList())
    println(solution3.toList())
    println(solution4.toList())
}