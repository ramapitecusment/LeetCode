package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4501/

Example 2: Given a sorted array of unique integers and a target integer,
return true if there exists a pair of numbers that sum to target, false otherwise.
This problem is similar to Two Sum.

For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)les.

*/

class TwoSumSorted {

    fun checkForTarget(nums: IntArray, target: Int): Boolean {
        var p1 = 0
        var p2 = nums.size - 1

        while (p1 < p2) {
            val sum = nums[p1] + nums[p2]
            if (sum == target) return true
            else if (sum > target) p2--
            else p1++
        }

        return false
    }

}

fun main() {
    val solution1 = TwoSumSorted().checkForTarget(intArrayOf(1, 2, 4, 6, 8, 9, 14, 15), 13)
    val solution2 = TwoSumSorted().checkForTarget(intArrayOf(1, 2, 4, 6, 8, 9, 14, 15), 0)
    val solution3 = TwoSumSorted().checkForTarget(intArrayOf(1, 2, 4, 6, 8, 9, 14, 15), 16)
    val solution4 = TwoSumSorted().checkForTarget(intArrayOf(1, 2, 4, 6, 8, 9, 14, 15), 6)

    assertEquals(true, solution1)
    assertEquals(false, solution2)
    assertEquals(true, solution3)
    assertEquals(true, solution4)
}