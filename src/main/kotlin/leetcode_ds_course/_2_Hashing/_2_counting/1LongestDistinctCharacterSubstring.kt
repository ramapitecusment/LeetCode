package leetcode_ds_course._2_hashing._2_counting

import Assert.Assert.assertEquals


/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4512/

Example 1: You are given a string s and an integer k. Find the length of the longest substring that contains at most k distinct characters.

For example, given s = "eceba" and k = 2, return 3. The longest substring with at most 2 distinct characters is "ece".

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class LongestDistinctCharacterSubstring {
    fun findLongestSubstring(s: String, k: Int): Int {
        val counts = mutableMapOf<Char, Int>()
        var left = 0
        var ans = 0
        for (right in s.indices) {
            val c = s[right]
            counts[c] = counts.getOrDefault(c, 0) + 1
            while (counts.size > k) {
                val remove = s[left]
                counts[remove] = counts.getOrDefault(remove, 0) - 1
                if (counts[remove] == 0) {
                    counts.remove(remove)
                }
                left++
            }
            ans = Math.max(ans, right - left + 1)
        }
        return ans
    }
}

fun main() {
    val solution1 = LongestDistinctCharacterSubstring().findLongestSubstring("eceba", 3)

    assertEquals(3, solution1)
}
