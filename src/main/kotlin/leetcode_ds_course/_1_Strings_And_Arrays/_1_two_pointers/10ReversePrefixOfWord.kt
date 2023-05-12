package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals
import java.lang.StringBuilder

/*

https://leetcode.com/problems/reverse-prefix-of-word/

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and
ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive).
The resulting string will be "dcbaefd".

Return the resulting string.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Complexity Analysis

Time Complexity: O(N).
Space Complexity: O(1).

*/

class ReversePrefixOfWord {
//    fun reversePrefix(word: String, ch: Char): String {
//        var firstOccurrence = -1
//        for (i in word.indices) {
//            if (word[i] == ch) {
//                firstOccurrence = i
//                break
//            }
//        }
//
//        if (firstOccurrence == -1) return word
//        val builder = StringBuilder()
//        for (i in firstOccurrence downTo 0) {
//            builder.append(word[i])
//        }
//
//        for (i in firstOccurrence + 1 until word.length) {
//            builder.append(word[i])
//        }
//
//        return builder.toString()
//    }

    fun reversePrefix(word: String, ch: Char): String {
        var firstOccurrence = -1
        for (i in word.indices) {
            if (word[i] == ch) {
                firstOccurrence = i
                break
            }
        }

        if (firstOccurrence == -1) return word
        var p1 = 0
        var p2 = firstOccurrence
        val array = word.toCharArray()
        while (p1 < p2) {
            array[p1] = word[p2]
            array[p2] = word[p1]
            p1++
            p2--
        }
        return String(array)
    }
}

fun main() {
    val solution1 = ReversePrefixOfWord().reversePrefix("abcdefd", 'd')
    val solution2 = ReversePrefixOfWord().reversePrefix("xyxzxe", 'z')
    val solution3 = ReversePrefixOfWord().reversePrefix("abcd", 'z')
    val solution4 = ReversePrefixOfWord().reversePrefix("z", 'z')
    val solution5 = ReversePrefixOfWord().reversePrefix("zbz", 'z')
    val solution6 = ReversePrefixOfWord().reversePrefix("bzbz", 'z')

    assertEquals("dcbaefd", solution1)
    assertEquals("zxyxxe", solution2)
    assertEquals("abcd", solution3)
    assertEquals("z", solution4)
    assertEquals("zbz", solution5)
    assertEquals("zbbz", solution6)
}