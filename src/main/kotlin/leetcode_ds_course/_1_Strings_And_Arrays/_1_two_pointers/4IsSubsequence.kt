package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4501/

Example 4: 392. Is Subsequence.

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class IsSubsequence {

    fun isSubsequence(text: String, target: String): Boolean {
        var p1 = 0
        var p2 = 0

        while (p1 < text.length && p2 < target.length) {
            if (text[p1] == target[p2]) p2++
            p1++
        }

        return p2 == target.length
    }

}

fun main() {
    val solution1 = IsSubsequence().isSubsequence("abcde", "ace")
    val solution2 = IsSubsequence().isSubsequence("abcde", "aec")

    assertEquals(true, solution1)
    assertEquals(false, solution2)
}