package leetcode_ds_course._1_Strings_And_Arrays._2_sliding_window

import Assert.Assert.assertEquals
import kotlin.math.max

/*

https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Complexity Analysis

Time Complexity: O(N).
Space Complexity: O(1).

*/

class MaximumNumberOfVowelsInSubstringOfGivenLength {

//    private val vowels = setOf('a', 'e', 'i', 'o', 'u')
//    fun maxVowels(s: String, k: Int): Int {
//        var ans: Int
//        var curr = 0
//
//        for (i in 0 until k) {
//            if (s[i] in vowels) curr++
//        }
//
//        ans = curr
//        for (i in k until s.length) {
//            if (s[i] in vowels) curr++
//            if (s[i - k] in vowels) curr--
//            ans = max(ans, curr)
//        }
//        return ans
//    }

//    private val vowel = intArrayOf(1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0)
//    fun maxVowels(s: String, k: Int): Int {
//        var r0 = 0
//        for (i in 0 until k)
//            r0 += vowel[s[i] - 'a']
//        var r = r0
//        for (i in k until s.length) {
//            r0 -= vowel[s[i - k] - 'a']
//            r0 += vowel[s[i] - 'a']
//            if (r0 > r)
//                r = r0
//        }
//        return r
//    }

    fun maxVowels(s: String, k: Int): Int {
        var curr = 0
        for(i in 0 until k) {
            if(s[i].isVowel()) curr++
        }
        var ans = curr
        for(i in k until s.length) {
            if(s[i - k].isVowel()) curr--
            if(s[i].isVowel()) curr++
            ans = max(ans, curr)
        }
        return ans
    }

    fun Char.isVowel() = this == 'a' || this == 'e' || this == 'i' || this == 'o' || this == 'u'

}

fun main() {
    val solution1 = MaximumNumberOfVowelsInSubstringOfGivenLength().maxVowels("abciiidef", 3)
    val solution2 = MaximumNumberOfVowelsInSubstringOfGivenLength().maxVowels("aeiou", 2)
    val solution3 = MaximumNumberOfVowelsInSubstringOfGivenLength().maxVowels("leetcode", 3)
    val solution4 = MaximumNumberOfVowelsInSubstringOfGivenLength().maxVowels("weallloveyou", 7)

    assertEquals(3, solution1)
    assertEquals(2, solution2)
    assertEquals(2, solution3)
    assertEquals(4, solution4)
}