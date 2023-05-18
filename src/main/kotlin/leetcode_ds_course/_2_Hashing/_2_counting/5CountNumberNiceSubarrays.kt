package leetcode_ds_course._2_hashing._2_counting

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4512/
https://leetcode.com/problems/count-number-of-nice-subarrays/

Example 5: 1248. Count Number of Nice Subarrays

Given an array of positive integers nums and an integer k. Find the number of subarrays with exactly k odd numbers in them.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class CountNumberNiceSubarrays {

    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()
        map[0] = 1
        var ans = 0
        var curr = 0

        nums.forEach {
            curr += it % 2
            ans += map.getOrDefault(curr - k, 0)
            map[curr] = map.getOrDefault(curr, 0) + 1
        }

        return ans
    }

}

fun main() {
    val solution1 = CountNumberNiceSubarrays().numberOfSubarrays(intArrayOf(1, 1, 2, 1, 1), 3)
    val solution2 = CountNumberNiceSubarrays().numberOfSubarrays(intArrayOf(2, 4, 6), 1)
    val solution3 = CountNumberNiceSubarrays().numberOfSubarrays(intArrayOf(2, 2, 2, 1, 2, 2, 1, 2, 2, 2), 2)

    assertEquals(2, solution1)
    assertEquals(0, solution2)
    assertEquals(16, solution3)
}