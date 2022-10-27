package _Top_100_Liked_Questions._26_Remove_Duplicates_from_Sorted_Array

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {

//    fun removeDuplicates(nums: IntArray): Int {
//        var insertIndex = 1
//
//        for (i in 1 until nums.size) {
//            if (nums[i] != nums[i - 1]) {
//                nums[insertIndex++] = nums[i]
//            }
//        }
//
//        return insertIndex
//    }

    fun removeDuplicates(nums: IntArray): Int {
        var insertIndex = 1

        nums.forEach {
            if (it > nums[insertIndex - 1]) nums[insertIndex++] = it
        }

        return insertIndex
    }
}

fun main() {
    val nums1 = intArrayOf(1, 1, 1)
    val solution1 = Solution().removeDuplicates(nums1) // 1
    val nums2 = intArrayOf(1, 1, 2)
    val solution2 = Solution().removeDuplicates(nums2) // 2
    val nums3 = intArrayOf(0, 0, 1, 1, 2, 2, 3, 3, 4, 4)
    val solution3 = Solution().removeDuplicates(nums3) // 5
    val nums4 = intArrayOf(0, 1, 2, 2, 3, 4)
    val solution4 = Solution().removeDuplicates(nums4) // 5

    println(solution1)
    nums1.forEach(::print)
    println()
    println(solution2)
    nums2.forEach(::print)
    println()
    println(solution3)
    nums3.forEach(::print)
    println()
    println(solution4)
    nums4.forEach(::print)
    println()
}