package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals
import kotlin.math.max

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4502/

Example 2: You are given a binary substring s (a string containing only "0" and "1"). An operation involves flipping a "0" into a "1".
What is the length of the longest substring containing only "1" after performing at most one operation?

For example, given s = "1101100111", the answer is 5. If you perform the operation at index 2, the string becomes 1111100111.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class BinarySubstringFlip {

    fun findLength(s: String): Int {
        var result = 0
        var left = 0
        var zeros = 0

        for (right in s.indices) {
            if (s[right] == '0') zeros++
            while (zeros > 1 && left <= right) {
                if (s[left] == '0') zeros--
                left++
            }
            result = max(result, right - left + 1)
        }

        return result
    }

}

fun main() {
    val solution1 = BinarySubstringFlip().findLength("1101100111")
    val solution2 = BinarySubstringFlip().findLength("1101101111")
    val solution3 = BinarySubstringFlip().findLength("010")
    val solution4 = BinarySubstringFlip().findLength("001")
    val solution5 = BinarySubstringFlip().findLength("100")
    val solution6 = BinarySubstringFlip().findLength("00000")
    val solution7 = BinarySubstringFlip().findLength("11111")

    assertEquals(5, solution1)
    assertEquals(7, solution2)
    assertEquals(2, solution3)
    assertEquals(2, solution4)
    assertEquals(2, solution5)
    assertEquals(1, solution6)
    assertEquals(5, solution7)
}