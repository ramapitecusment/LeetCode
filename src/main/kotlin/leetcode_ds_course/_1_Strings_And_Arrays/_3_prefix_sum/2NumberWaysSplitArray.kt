package leetcode_ds_course._1_Strings_And_Arrays._3_prefix_sum

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4503/

Example 2: 2270. Number of Ways to Split Array

Given an integer array nums, find the number of ways to split the array into two parts so that the first
section has a sum greater than or equal to the sum of the second section. The second section should have at least one number..

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n+m) and Space O(n) or O(1)

*/

class NumberWaysSplitArray {

//    fun waysToSplitArray(nums: IntArray): Int {
//        val sumArray = IntArray(nums.size)
//        var ans = 0
//        sumArray[0] = nums[0]
//        for (i in 1 until nums.size) {
//            sumArray[i] = nums[i] + sumArray[i - 1]
//        }
//
//        for (i in 0 until sumArray.size - 1) {
//            if (sumArray[i] >= sumArray[sumArray.size - 1] - sumArray[i]) ans++
//        }
//
//        return ans
//    }

    fun waysToSplitArray(nums: IntArray): Int {
        var ans = 0
        var total = 0
        var leftPrefix = 0

        for (i in nums.indices) {
            total += nums[i]
        }

        for (i in 0 until nums.size - 1) {
            leftPrefix += nums[i]
            if (leftPrefix >= total - leftPrefix) ans++
        }

        return ans
    }

}

fun main() {
    val solution1 = NumberWaysSplitArray().waysToSplitArray(intArrayOf(10, 4, -8, 7))
    val solution2 = NumberWaysSplitArray().waysToSplitArray(intArrayOf(10, 4, -8, 7, 55))

    assertEquals(2, solution1)
    assertEquals(0, solution2)
}