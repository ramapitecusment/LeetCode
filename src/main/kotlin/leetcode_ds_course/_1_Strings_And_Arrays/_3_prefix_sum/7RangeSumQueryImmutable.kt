package leetcode_ds_course._1_Strings_And_Arrays._3_prefix_sum

import Assert.Assert.assertEquals

/*

https://leetcode.com/problems/range-sum-query-immutable/

Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive
(i.e. nums[left] + nums[left + 1] + ... + nums[right]).

/////////////////////////////////////////////////////////////////////////////////////////////////////

Complexity Analysis

Time Complexity: O(1).
Space Complexity: O(N).

*/

class NumArray(nums: IntArray) {

    private val sumArray = IntArray(nums.size + 1)

    init {
        for (i in nums.indices) {
            sumArray[i + 1] = sumArray[i] + nums[i]
        }
    }

    fun sumRange(left: Int, right: Int) = sumArray[right + 1] - sumArray[left]

}

fun main() {
    val numArray = NumArray(intArrayOf(-2, 0, 3, -5, 2, -1)) // sum: (-2, -2, 1, -4, -2, -3)
    val solution1 = numArray.sumRange(0, 2)
    val solution2 = numArray.sumRange(2, 5)
    val solution3 = numArray.sumRange(2, 4)
    val solution4 = numArray.sumRange(0, 5)

    assertEquals(1, solution1)
    assertEquals(-1, solution2)
    assertEquals(0, solution3)
    assertEquals(-3, solution4)
}