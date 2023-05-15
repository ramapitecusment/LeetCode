package leetcode_ds_course._2_hashing._1_checking_existence

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4511/

Example 2: 2351. First Letter to Appear Twice

Given a string s, return the first character to appear twice. It is guaranteed that the input will have a duplicate character.

/////////////////////////////////////////////////////////////////////////////////////////////////////

This improves our time complexity to O(n) as each for loop iteration now runs in constant time.

The space complexity is a more interesting topic of discussion. Many people will argue that the space complexity is O(1)
because the input can only have characters from the English alphabet, which is bounded by a constant (26).
This is very common with string problems and technically correct. In an interview setting, this is probably a safe answer,
but you should also note that the space complexity could be O(m), where m is the number of allowable characters in the input.

*/

class FirstLetterAppearTwice {

    fun repeatedCharacter(text: String): Char {
        val charMap = mutableMapOf<Char, Int>()
        text.forEach {
            if (charMap.put(it, 0) != null) return it
        }
        return ' '
    }

}

fun main() {
    val solution1 = FirstLetterAppearTwice().repeatedCharacter("abcdeda")

    assertEquals('d', solution1)
}