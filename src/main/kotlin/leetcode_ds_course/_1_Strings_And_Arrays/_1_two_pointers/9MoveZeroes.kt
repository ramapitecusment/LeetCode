package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals

/*

https://leetcode.com/problems/move-zeroes/

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Complexity Analysis

Time Complexity: O(N).
Space Complexity: O(1).

*/

class MoveZeroes {

    fun moveZeroes(nums: IntArray) {
        var lastNonZeroIndex = 0
        for (i in nums.indices) {
            if (nums[i] != 0) nums[lastNonZeroIndex++] = nums[i]
        }

        for (i in lastNonZeroIndex until nums.size) {
            nums[i] = 0
        }
    }

//    fun moveZeroes(nums: IntArray) {
//        var lastNonZeroIndex = 0
//        var curr: Int
//        for (i in nums.indices) {
//            if (nums[i] != 0) {
//                curr = nums[lastNonZeroIndex]
//                nums[lastNonZeroIndex++] = nums[i]
//                nums[i] = curr
//            }
//        }
//    }

}

fun main() {
    val array1 = intArrayOf(0, 1, 0, 3, 12)
    val array2 = intArrayOf(0)
    val array3 = intArrayOf(0, 1)
    val array4 = intArrayOf(1, 0)
    val array5 = intArrayOf(1)
    val array6 = intArrayOf(1, 2, 3, 4, 5)

    val solution1 = MoveZeroes().moveZeroes(array1)
    val solution2 = MoveZeroes().moveZeroes(array2)
    val solution3 = MoveZeroes().moveZeroes(array3)
    val solution4 = MoveZeroes().moveZeroes(array4)
    val solution5 = MoveZeroes().moveZeroes(array5)
    val solution6 = MoveZeroes().moveZeroes(array6)

    assertEquals(listOf(1, 3, 12, 0, 0), array1.toList())
    assertEquals(listOf(0), array2.toList())
    assertEquals(listOf(1, 0), array3.toList())
    assertEquals(listOf(1, 0), array4.toList())
    assertEquals(listOf(1), array5.toList())
    assertEquals(listOf(1, 2, 3, 4, 5), array6.toList())
}