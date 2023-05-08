package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4501/

Example 1: Return true if a given string is a palindrome, false otherwise.

A string is a palindrome if it reads the same forwards as backwards.
That means, after reversing it, it is still the same string. For example: "abcdcba", or "racecar".

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class Palindrome {

    fun checkIfPalindrome(text: String): Boolean {
        var p1 = 0
        var p2 = text.length - 1
        while (p1 < p2) {
            if (text[p1] != text[p2]) return false
            p1++
            p2--
        }

        return true
    }

}

fun main() {
    val solution1 = Palindrome().checkIfPalindrome("abcdcba") // true
    val solution2 = Palindrome().checkIfPalindrome("racecar") // true
    val solution3 = Palindrome().checkIfPalindrome("abcddcba") // true
    val solution4 = Palindrome().checkIfPalindrome("abcdbcba") // false
    val solution5 = Palindrome().checkIfPalindrome("aceba") // false

    assertEquals(true, solution1)
    assertEquals(true, solution2)
    assertEquals(true, solution3)
    assertEquals(false, solution4)
    assertEquals(false, solution5)
}