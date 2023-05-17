package leetcode_ds_course._2_hashing._2_counting

import Assert.Assert.assertEquals


/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4512/

Example 3: 1941. Check if All Characters Have Equal Number of Occurrences

Given a string s, determine if all characters have the same frequency.

For example, given s = "abacbc", return true. All characters appear twice. Given s = "aaabb", return false. "a" appears 3 times, "b" appears 2 times. 3 != 2.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class CheckIfAllCharactersHaveEqualNumberOccurrences {

//    fun areOccurrencesEqual(s: String): Boolean {
//        val counts: MutableMap<Char, Int> = HashMap()
//        for (c in s.toCharArray()) {
//            counts[c] = counts.getOrDefault(c, 0) + 1
//        }
//        val frequencies: Set<Int> = HashSet(counts.values)
//        return frequencies.size == 1
//    }

    fun areOccurrencesEqual(s: String): Boolean {
        val map = mutableMapOf<Char, Int>()

        s.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        val target = map[s[0]]

        map.forEach {
            if (it.value != target) return false
        }

        return true
    }

}

fun main() {
    val solution1 = CheckIfAllCharactersHaveEqualNumberOccurrences().areOccurrencesEqual("abacbc")
    val solution2 = CheckIfAllCharactersHaveEqualNumberOccurrences().areOccurrencesEqual("aaabb")

    assertEquals(true, solution1)
    assertEquals(false, solution2)
}