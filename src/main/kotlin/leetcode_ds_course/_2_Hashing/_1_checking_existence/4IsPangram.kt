package leetcode_ds_course._2_hashing._1_checking_existence

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4601/

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class IsPangram {

//    fun checkIfPangram(sentence: String): Boolean {
//        // We iterate over 'sentence' for 26 times, one for each letter 'currChar'.
//        for (i in 0..25) {
//            val currChar = ('a'.code + i).toChar()
//
//            // If 'sentence' doesn't contain currChar, it is not a pangram.
//            if (sentence.indexOf(currChar) == -1) return false
//        }
//
//        // If we manage to find all 26 letters, it is a pangram.
//        return true
//    }

//    fun checkIfPangram(sentence: String): Boolean {
//        // Initialize seen = 0 since we start with no letter.
//        var seen = 0
//
//        // Iterate over 'sentence'.
//        for (currChar in sentence.toCharArray()) {
//            // Map each 'currChar' to its index using its ASCII code.
//            // 'currBit' represents the bit for 'currChar'.
//            val currBit = 1 shl (currChar - 'a')
//
//            // Use 'OR' operation since we only add its bit for once.
//            seen = seen or currBit
//        }
//
//        // Once we finish iterating, check if 'seen' contains 26 bits of 1.
//        return seen == (1 shl 26) - 1
//    }

    fun checkIfPangram(sentence: String): Boolean {
        val englishAlphabetSet = mutableSetOf<Char>()
        sentence.forEach {
            englishAlphabetSet.add(it)
        }
        return englishAlphabetSet.size == 26
    }

}

fun main() {
    val solution1 = IsPangram().checkIfPangram("thequickbrownfoxjumpsoverthelazydog")
    val solution2 = IsPangram().checkIfPangram("leetcode")

    assertEquals(true, solution1)
    assertEquals(false, solution2)
}