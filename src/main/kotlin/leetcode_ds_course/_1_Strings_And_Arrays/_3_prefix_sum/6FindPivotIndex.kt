package leetcode_ds_course._1_Strings_And_Arrays._3_prefix_sum

import Assert.Assert.assertEquals

/*

https://leetcode.com/problems/find-pivot-index/

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the
sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Complexity Analysis

Time Complexity: O(N).
Space Complexity: O(1).

*/

class FindPivotIndex {

//    fun pivotIndex(nums: IntArray): Int {
//        val array = IntArray(nums.size)
//        array[0] = nums[0]
//        for (i in 1 until nums.size) {
//            array[i] = array[i - 1] + nums[i]
//        }
//
//        for (i in nums.indices) {
//            if (array[i] - nums[i] == array.last() - array[i]) return i
//        }
//
//        return -1
//    }

    fun pivotIndex(nums: IntArray): Int {
        var total = 0
        var curr = 0

        for (i in nums) {
            total += i
        }

        for (i in nums.indices) {
            if (curr == total - nums[i] - curr) return i
            curr += nums[i]
        }

        return -1
    }

}

fun main() {
    val solution1 = FindPivotIndex().pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
    val solution2 = FindPivotIndex().pivotIndex(intArrayOf(1, 2, 3))
    val solution3 = FindPivotIndex().pivotIndex(intArrayOf(2, 1, -1))
    val solution4 = FindPivotIndex().pivotIndex(intArrayOf(-1, -1, 0, 1, 1, 0))

    assertEquals(3, solution1)
    assertEquals(-1, solution2)
    assertEquals(0, solution3)
    assertEquals(5, solution4)
}