package leetcode_ds_course._2_hashing._2_counting

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4662/
https://leetcode.com/problems/largest-unique-number/editorial/

Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class LargestUniqueNumber {

    fun largestUniqueNumber(nums: IntArray): Int {
        val numCountMap = mutableMapOf<Int, Int>()
        var ans = -1

        nums.forEach {
            numCountMap[it] = (numCountMap[it] ?: -1) + 1
        }

        numCountMap.forEach { key, value ->
            if (value == 0 && key > ans) ans = key
        }

        return ans
    }

}

fun main() {
    val solution1 = LargestUniqueNumber().largestUniqueNumber(intArrayOf(5, 7, 3, 9, 4, 9, 8, 3, 1))
    val solution2 = LargestUniqueNumber().largestUniqueNumber(intArrayOf(9, 9, 8, 8))

    assertEquals(8, solution1)
    assertEquals(-1, solution2)
}