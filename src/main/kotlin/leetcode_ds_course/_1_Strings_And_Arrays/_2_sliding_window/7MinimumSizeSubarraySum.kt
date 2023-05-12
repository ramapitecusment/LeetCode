package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals
import kotlin.math.min

/*

https://leetcode.com/problems/minimum-size-subarray-sum/

Given an array of positive integers nums and a positive integer target, return the minimal length of a
subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Complexity Analysis

Time Complexity: O(N).
Space Complexity: O(1).

*/

class MinimumSizeSubarraySum {

    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var p1 = 0
        var p2 = 0
        var minSize = Int.MAX_VALUE
        var sum = 0
        while (p2 < nums.size) {
            sum += nums[p2]
            if (sum >= target) {
                while (sum >= target) {
                    sum -= nums[p1++]
                }
                minSize = min(minSize, p2 - p1 + 2)
            }
            p2++
        }

        return if (minSize == Int.MAX_VALUE) 0
        else minSize
    }

}

fun main() {
    val solution1 = MinimumSizeSubarraySum().minSubArrayLen(7, intArrayOf(2, 3, 1, 2, 4, 3))
    val solution2 = MinimumSizeSubarraySum().minSubArrayLen(4, intArrayOf(1, 4, 4))
    val solution3 = MinimumSizeSubarraySum().minSubArrayLen(11, intArrayOf(1, 1, 1, 1, 1, 1, 1, 1))
    val solution4 = MinimumSizeSubarraySum().minSubArrayLen(11, intArrayOf(1, 1, 1, 11))

    assertEquals(2, solution1)
    assertEquals(1, solution2)
    assertEquals(0, solution3)
    assertEquals(1, solution4)
}