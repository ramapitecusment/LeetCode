package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals
import kotlin.math.max

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4595/

Given a binary array nums and an integer k, return the maximum number
of consecutive 1's in the array if you can flip at most k 0's.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class MaxConsecutiveOnes {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var ans = 0
        var left = 0
        var zeros = 0

        for (right in nums.indices) {
            if (nums[right] == 0) zeros++

            while (zeros > k) {
                if (nums[left++] == 0) zeros--
            }

            ans = max(ans, right - left + 1)
        }

        return ans
    }
}

fun main() {
    val solution1 = MaxConsecutiveOnes().longestOnes(intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2)
    val solution2 =
        MaxConsecutiveOnes().longestOnes(intArrayOf(0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1), 3)

    assertEquals(6, solution1)
    assertEquals(10, solution2)
}