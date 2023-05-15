package leetcode_ds_course._2_hashing._1_checking_existence

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4511/

Example 1: 1. Two Sum

Given an array of integers nums and an integer target, return indices of two numbers such that they add up to target.
You cannot use the same index twice.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val difMap = mutableMapOf<Int, Int>() // key is the difference between target and value

        nums.forEachIndexed { index, value ->
            if (difMap[value] != null) return intArrayOf(difMap[value]!!, index)
            else difMap[target - value] = index
        }

        return intArrayOf()
    }

}

fun main() {
    val solution1 = TwoSum().twoSum(intArrayOf(5, 2, 7, 10, 3, 9), 8)

    assertEquals(listOf(0, 4), solution1.toList())
}