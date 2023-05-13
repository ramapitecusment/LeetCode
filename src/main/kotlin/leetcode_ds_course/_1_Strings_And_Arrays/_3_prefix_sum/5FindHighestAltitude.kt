package leetcode_ds_course._1_Strings_And_Arrays._3_prefix_sum

import Assert.Assert.assertEquals

/*

https://leetcode.com/problems/find-the-highest-altitude/

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n
where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
Return the highest altitude of a point.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Complexity Analysis

Time Complexity: O(N).
Space Complexity: O(1).

*/

class FindHighestAltitude {

    fun largestAltitude(gain: IntArray): Int {
        var ans = 0
        var curr = 0

        for (i in gain.indices) {
            curr += gain[i]
            ans = maxOf(ans, curr)
        }

        return ans
    }

}

fun main() {
    val solution1 = FindHighestAltitude().largestAltitude(intArrayOf(-5, 1, 5, 0, -7)) // 0 -5 -4 1 1 -6
    val solution2 = FindHighestAltitude().largestAltitude(intArrayOf(-4, -3, -2, -1, 4, 3, 2))
    val solution3 = FindHighestAltitude().largestAltitude(intArrayOf(52, -91, 72))

    assertEquals(1, solution1)
    assertEquals(0, solution2)
    assertEquals(52, solution3)
}