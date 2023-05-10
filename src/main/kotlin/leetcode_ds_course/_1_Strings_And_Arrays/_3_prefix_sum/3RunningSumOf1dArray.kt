package leetcode_ds_course._1_Strings_And_Arrays._3_prefix_sum

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4658/

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n+m) and Space O(n) or O(1)

*/


class RunningSumOf1dArray {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            nums[i] += nums[i-1]
        }
        return nums
    }
}

fun main() {
    val solution1 = RunningSumOf1dArray().runningSum(intArrayOf(1, 2, 3, 4))
    val solution2 = RunningSumOf1dArray().runningSum(intArrayOf(1, 1, 1, 1, 1))
    val solution3 = RunningSumOf1dArray().runningSum(intArrayOf(3, 1, 2, 10, 1))

    assertEquals(listOf(1,3,6,10), solution1.toList())
    assertEquals(listOf(1,2,3,4,5), solution2.toList())
    assertEquals(listOf(3,4,6,16,17), solution3.toList())
}