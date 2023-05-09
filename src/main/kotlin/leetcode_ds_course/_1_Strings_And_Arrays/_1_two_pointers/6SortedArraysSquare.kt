package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals
import kotlin.math.abs

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4689/

Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Because array is already sorted, therefore we do not need to sort it again.
Run in O(n) and Space O(1)

*/

//class SortedArraysSquare {
//
//    fun sortedSquares(nums: IntArray): IntArray {
//        var i = 0
//        var j = 0
//        val stack = Stack<Int>()
//        while (i < nums.size) {
//            val curr = nums[i]
//            val square = curr * curr
//            if (nums[i] < 0) {
//                stack.add(curr * curr)
//            } else {
//                while (stack.isNotEmpty()) {
//                    if (stack.last() < square) nums[j++] = stack.pop()
//                    else break
//                }
//                nums[j++] = square
//            }
//            i++
//        }
//
//        while (stack.isNotEmpty()) {
//            nums[j++] = stack.pop()
//        }
//        return nums
//    }
//
//}

class SortedArraysSquare {

    fun sortedSquares(nums: IntArray): IntArray {
        val size = nums.size
        val array = IntArray(size)
        var left = 0
        var right = size - 1
        for (i in size - 1 downTo 0) {
            if (abs(nums[left]) > abs(nums[right])) {
                array[i] = nums[left] * nums[left]
                left++
            } else {
                array[i] = nums[right] * nums[right]
                right--
            }
        }
        return array
    }

}

fun main() {
    val array1 = intArrayOf(-4, -1, 0, 3, 10)
    val solution1 = SortedArraysSquare().sortedSquares(array1)
    assertEquals(listOf(0, 1, 9, 16, 100), solution1.toList())

    val array2 = intArrayOf(-7, -3, 2, 3, 11)
    val solution2 = SortedArraysSquare().sortedSquares(array2)
    assertEquals(listOf(4, 9, 9, 49, 121), solution2.toList())

    val array3 = intArrayOf(-1)
    val solution3 = SortedArraysSquare().sortedSquares(array3)
    assertEquals(listOf(1), solution3.toList())
}