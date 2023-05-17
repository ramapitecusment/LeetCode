package leetcode_ds_course._2_hashing._2_counting

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4512/

Example 4: 560. Subarray Sum Equals K

Given an integer array nums and an integer k, find the number of subarrays whose sum is equal to k.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()
        map[0] = 1
        var curr = 0
        var ans = 0
        nums.forEachIndexed { index, value ->
            curr += value
            ans += map.getOrDefault(curr - k, 0)
            map[curr] = map.getOrDefault(curr, 0) + 1
        }
        return ans
    }
}

fun main() {
    val solution1 = SubarraySumEqualsK().subarraySum(intArrayOf(1, 2, 1, 2, 1), 3)

    assertEquals(4, solution1)
}