package _Top_100_Liked_Questions._26_Remove_Duplicates_from_Sorted_Array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var uniqueValues = 0

        for (i in nums.indices - 1) {
            if (nums[i] == nums[i + 1]) uniqueValues++
        }

        return uniqueValues
    }
}

fun main() {
    val solution1 = Solution().removeDuplicates(intArrayOf(1, 1, 2))
    val solution2 = Solution().removeDuplicates(intArrayOf(0, 0, 1, 1, 2, 2, 3, 3, 4))

    println(solution1)
    println(solution2)
}