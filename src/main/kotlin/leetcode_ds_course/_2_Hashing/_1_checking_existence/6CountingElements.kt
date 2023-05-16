package leetcode_ds_course._2_hashing._1_checking_existence

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4661/

Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr.
If there are duplicates in arr, count them separately.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class CountingElements {

    fun countElements(arr: IntArray): Int {
        val set = mutableSetOf<Int>()
        var counter = 0
        arr.forEach { set.add(it) }
        arr.forEach { if (set.contains(it + 1)) counter++ }
        return counter
    }

}

fun main() {
    val solution1 = CountingElements().countElements(intArrayOf(1, 2, 3))
    val solution2 = CountingElements().countElements(intArrayOf(1, 1, 3, 3, 5, 5, 7, 7))

    assertEquals(2, solution1)
    assertEquals(0, solution2)
}