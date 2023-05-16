package leetcode_ds_course._2_hashing._1_checking_existence

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4602/

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Constraints:

n == nums.length
1 <= n <= 10^4
0 <= nums[i] <= n
All the numbers of nums are unique.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n) or O(1)

*/

class MissingNumber {

//    fun missingNumber(nums: IntArray): Int {
//        val numsMap = hashMapOf<Int, Int>()
//
//        for (i in 0..nums.size) {
//            numsMap[i] = 0
//        }
//
//        nums.forEachIndexed { index, value ->
//            numsMap[value] = numsMap[value]!! + 1
//        }
//
//        numsMap.forEach { (k, v) ->
//            if (v == 0) return k
//        }
//
//        return -1
//    }

//    fun missingNumber(nums: IntArray): Int {
//        val set = mutableSetOf<Int>()
//
//        nums.forEach {
//            set.add(it)
//        }
//
//        for (i in 0..nums.size) {
//            if (!set.contains(i)) return i
//        }
//
//        return -1
//    }

    fun missingNumber(nums: IntArray): Int {
        // Gauss' Formula
        val expectedSum = nums.size * (nums.size + 1) / 2
        var sum = 0
        nums.forEach { sum += it }
        return expectedSum - sum
    }


}

fun main() {
    val solution1 = MissingNumber().missingNumber(intArrayOf(3, 0, 1))
    val solution2 = MissingNumber().missingNumber(intArrayOf(3, 0, 1))
    val solution3 = MissingNumber().missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1))

    assertEquals(2, solution1)
    assertEquals(2, solution2)
    assertEquals(8, solution3)
}