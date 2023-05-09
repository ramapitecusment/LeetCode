package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals
import kotlin.math.max

class LargestSumFixedSize {
    fun findBestSubarray(nums: IntArray, k: Int): Int {
        var ans: Int
        var curr = 0
        for (i in 0 until k) {
            curr += nums[i]
        }

        ans = curr
        for (i in k until nums.size) {
            curr = curr + nums[i] - nums[i - k]
            ans = max(ans, curr)
        }

        return ans
    }
}

fun main() {
    val solution1 = LargestSumFixedSize().findBestSubarray(intArrayOf(3, -1, 4, 12, -8, 5, 6), 4)

    assertEquals(18, solution1)
}