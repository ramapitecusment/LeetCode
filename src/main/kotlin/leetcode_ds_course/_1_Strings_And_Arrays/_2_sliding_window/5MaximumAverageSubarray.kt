package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals
import kotlin.math.max

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4594/

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
Any answer with a calculation error less than 10-5 will be accepted.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class MaximumAverageSubarray {

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var ans: Double
        var curr = 0.0
        for (i in 0 until k) {
            curr += nums[i]
        }

        ans = curr
        for (i in k until nums.size) {
            curr += nums[i] - nums[i - k]
            ans = max(ans, curr)
        }

        return ans / k
    }

}

fun main() {
    val solution1 = MaximumAverageSubarray().findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4)
    val solution2 = MaximumAverageSubarray().findMaxAverage(intArrayOf(5), 1)

    assertEquals(12.75, solution1, 1.0)
    assertEquals(5.0, solution2, 1.0)
}