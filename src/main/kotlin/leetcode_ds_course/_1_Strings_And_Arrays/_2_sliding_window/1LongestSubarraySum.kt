package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals
import kotlin.math.max

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4502/

Example 1: Given an array of positive integers nums and an integer k,
find the length of the longest subarray whose sum is less than or equal to k.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class LongestSubArraySum {


    fun findLength(nums: IntArray, k: Int): Int {
        var sum = 0
        var p1 = 0
        var result = 0

        for (i in nums.indices) {
            sum += nums[i]
            while (sum > k && p1 <= i) sum -= nums[p1++]
            result = max(result, i - p1 + 1)
        }

        return result
    }

}

fun main() {
    val solution1 = LongestSubArraySum().findLength(intArrayOf(3, 1, 2, 7, 4, 2, 1, 1, 5), 8)
    val solution2 = LongestSubArraySum().findLength(intArrayOf(5, 1, 1, 1, 1, 1, 1, 1, 1, 8), 8)
    val solution3 = LongestSubArraySum().findLength(intArrayOf(11, 12, 13, 14, 15, 8), 8)
    val solution4 = LongestSubArraySum().findLength(intArrayOf(3), 8)
    val solution5 = LongestSubArraySum().findLength(intArrayOf(1, 1, 1, 1, 1, 1, 1), 8)

    assertEquals(4, solution1)
    assertEquals(8, solution2)
    assertEquals(1, solution3)
    assertEquals(1, solution4)
    assertEquals(7, solution5)
}