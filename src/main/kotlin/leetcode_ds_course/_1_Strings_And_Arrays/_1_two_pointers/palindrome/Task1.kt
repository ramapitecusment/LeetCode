package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers.palindrome

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4501/

Example 1: Return true if a given string is a palindrome, false otherwise.

A string is a palindrome if it reads the same forwards as backwards.
That means, after reversing it, it is still the same string. For example: "abcdcba", or "racecar".

*/

class Solution {

    fun checkIfPalindrome(text: String) {

    }

}

fun main() {
    val solution1 = Solution().checkIfPalindrome("abcdcba") // true
    val solution2 = Solution().checkIfPalindrome("racecar") // false
    val solution3 = Solution().checkIfPalindrome("abcddcba") // true
    val solution4 = Solution().checkIfPalindrome("abcdbcba") // false
}