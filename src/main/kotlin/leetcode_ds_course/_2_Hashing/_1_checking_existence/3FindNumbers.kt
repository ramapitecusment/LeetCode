package leetcode_ds_course._2_hashing._1_checking_existence

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4511/

Example 3: Given an integer array nums, find all the numbers x that satisfy the following: x + 1 is not in nums, and x - 1 is not in nums.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class FindNumbers {

    fun findNumbers(nums: IntArray): List<Int> {
        val set = mutableSetOf<Int>()
        val list = mutableListOf<Int>()

        nums.forEach(set::add)

        nums.forEach {
            if (!set.contains(it + 1) && !set.contains(it - 1)) list.add(it)
        }

        return list
    }

}

fun main() {

}