package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals

/*

https://leetcode.com/problems/get-equal-substrings-within-budget/

You are given two strings s and t of the same length and an integer maxCost.

You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]|
(i.e., the absolute difference between the ASCII values of the characters).

Return the maximum length of a substring of s that can be changed to be the same as the corresponding
substring of t with a cost less than or equal to maxCost. If there is no substring from s that can be changed
to its corresponding substring from t, return 0

/////////////////////////////////////////////////////////////////////////////////////////////////////

Complexity Analysis

Time Complexity: O(N).
Space Complexity: O(1).

*/

class GetEqualSubstringsWithinBudge {

    fun equalSubstring(s: String, t: String, maxCost: Int): Int {
        var ans = 0
        var left = 0
        var curr = 0

        for (right in s.indices) {
            curr += abs(s[right] - t[right])

            while (curr > maxCost) {
                curr -= abs(s[left] - t[left])
                left++
            }

            ans = max(ans, right - left + 1)
        }

        return ans
    }

    private fun max(a: Int, b: Int) = if (a >= b) a else b

    private fun abs(a: Int) = if (a < 0) -a else a

}

fun main() {
    val solution1 = GetEqualSubstringsWithinBudge().equalSubstring(s = "abcd", t = "bcdf", maxCost = 3)
    val solution2 = GetEqualSubstringsWithinBudge().equalSubstring(s = "abcd", t = "cdef", maxCost = 3)
    val solution3 = GetEqualSubstringsWithinBudge().equalSubstring(s = "abcd", t = "acde", maxCost = 0)
    val solution4 = GetEqualSubstringsWithinBudge().equalSubstring(s = "ahcd", t = "acde", maxCost = 3)

    assertEquals(3, solution1)
    assertEquals(1, solution2)
    assertEquals(1, solution3)
    assertEquals(2, solution4)
}