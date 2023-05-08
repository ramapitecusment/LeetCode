package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4501/

Example 3: Given two sorted integer arrays, return an array that combines both of them and is also sorted.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n+m) and Space O(1)

*/

class CombineTwoArraysSorted {

    fun combine(nums1: List<Int>, nums2: List<Int>): List<Int> {
        var i = 0
        var j = 0
        val result = mutableListOf<Int>()
        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] < nums2[j]) result.add(nums1[i++])
            else result.add(nums2[j++])
        }

        while (i < nums1.size) {
            result.add(nums1[i++])
        }

        while (j < nums2.size) {
            result.add(nums2[j++])
        }

        return result
    }

}

fun main() {
    val solution1 = CombineTwoArraysSorted().combine(listOf(1, 4, 7, 20), listOf(3, 5, 6))
    val solution2 = CombineTwoArraysSorted().combine(listOf(1, 4, 7, 20), listOf(45))
    val solution3 = CombineTwoArraysSorted().combine(listOf(1, 4, 7, 20), listOf(1))
    val solution4 = CombineTwoArraysSorted().combine(listOf(20), listOf(3, 5, 6))
    val solution5 = CombineTwoArraysSorted().combine(listOf(), listOf(3, 5, 6))

    assertEquals(listOf(1, 3, 4, 5, 6, 7, 20), solution1)
    assertEquals(listOf(1, 4, 7, 20, 45), solution2)
    assertEquals(listOf(1, 1, 4, 7, 20), solution3)
    assertEquals(listOf(3, 5, 6, 20), solution4)
    assertEquals(listOf(3, 5, 6), solution5)
}
