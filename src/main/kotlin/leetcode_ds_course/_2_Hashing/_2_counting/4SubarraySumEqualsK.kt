package leetcode_ds_course._2_hashing._2_counting

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4512/
https://leetcode.com/problems/subarray-sum-equals-k/editorial/

Example 4: 560. Subarray Sum Equals K

Given an integer array nums and an integer k, find the number of subarrays whose sum is equal to k.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class SubarraySumEqualsK {

    fun subarraySum(nums: IntArray, k: Int): Int {
        val sumOccurrencesMap = mutableMapOf<Int, Int>()
        sumOccurrencesMap[0] = 1
        var ans = 0
        var curr = 0

//        If a sub-array sums up to k, then the sum at the end of this sub-array will be sumEnd = sumStart + k.
//        That implies: sumStart = sumEnd - k.

        nums.forEach {
            curr += it
            ans += sumOccurrencesMap.getOrDefault(curr - k, 0)
            sumOccurrencesMap[curr] = sumOccurrencesMap.getOrDefault(curr, 0) + 1
        }

        return ans
    }

}

fun main() {
    val solution1 = SubarraySumEqualsK().subarraySum(intArrayOf(1, 2, 1, 2, 1), 3)
    val solution2 = SubarraySumEqualsK().subarraySum(intArrayOf(1, 2, 3, 4, 5), 3)
    val solution3 = SubarraySumEqualsK().subarraySum(intArrayOf(1, 2, 6, 4, 5), 3)

    assertEquals(4, solution1)
    assertEquals(2, solution2)
    assertEquals(1, solution3)
}