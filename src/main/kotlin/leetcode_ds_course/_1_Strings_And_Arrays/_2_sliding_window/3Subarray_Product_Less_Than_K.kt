package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4502/

Example 3: 713. Subarray Product Less Than K.

Given an array of positive integers nums and an integer k, return the number of contiguous subarrays
where the product of all the elements in the subarray is strictly less than k.

For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8. The subarrays with products less than k are:

[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]

Key idea: Whenever you see a problem asking for the number of subarrays, think of this: at each index,
how many valid subarrays end at this index? Let's split the 8 subarrays by their ending indices:

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class SubArrayProduct {

    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        if (k < 1) return 0
        var result = 0
        var left = 0
        var product = 1

        for (right in nums.indices) {
            product *= nums[right]
            while (product >= k) {
                product /= nums[left++]
            }
            result += right - left + 1
        }

        return result
    }
}

fun main() {
    val solution1 = SubArrayProduct().numSubarrayProductLessThanK(intArrayOf(10, 5, 2, 6), 100)
    val solution2 = SubArrayProduct().numSubarrayProductLessThanK(intArrayOf(10, 5, 2, 6, 100), 100)

    assertEquals(8, solution1)
    assertEquals(8, solution2)
}