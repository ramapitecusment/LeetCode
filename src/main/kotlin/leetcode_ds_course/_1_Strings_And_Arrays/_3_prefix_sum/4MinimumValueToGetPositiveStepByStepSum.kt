package leetcode_ds_course._1_Strings_And_Arrays._3_prefix_sum

import Assert.Assert.assertEquals
import kotlin.math.min

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4657/

Given an array of integers nums, you start with an initial positive value startValue.

In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).

Return the minimum positive value of startValue such that the step by step sum is never less than 1.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class MinimumValueToGetPositiveStepByStepSum {

//    fun minStartValue(nums: IntArray): Int {
//        var minValue = nums[0]
//        for (i in 1 until nums.size) {
//            val curr = nums[i] + nums[i - 1]
//            nums[i] = curr
//            if (curr < minValue) minValue = curr
//        }
//        var ans = 1 - minValue
//        if (ans < 1) ans = 1
//        return ans
//    }

    fun minStartValue(nums: IntArray): Int {
        var total = 0
        var minValue = 0
        for (element in nums) {
            total += element
            minValue = min(minValue, total)
        }
        return 1 - minValue
    }

}

fun main() {
    val solution1 = MinimumValueToGetPositiveStepByStepSum().minStartValue(intArrayOf(-3, 2, -3, 4, 2))
    val solution2 = MinimumValueToGetPositiveStepByStepSum().minStartValue(intArrayOf(1, 2))
    val solution3 = MinimumValueToGetPositiveStepByStepSum().minStartValue(intArrayOf(1, -2, -3))

    assertEquals(5, solution1)
    assertEquals(1, solution2)
    assertEquals(5, solution3)
}