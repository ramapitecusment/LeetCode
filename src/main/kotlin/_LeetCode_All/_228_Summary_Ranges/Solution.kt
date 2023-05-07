package _LeetCode_All._228_Summary_Ranges

//https://leetcode.com/problems/summary-ranges/

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val result = mutableListOf<String>()
        var l = 0
        var r = 1

        while (r <= nums.size) {
            if (r == nums.size || nums[r-1] + 1 != nums[r]) {
                if (r - l == 1) result.add("${nums[l]}")
                else result.add("${nums[l]}->${nums[r-1]}")
                l=r
            }
            r++
        }

        return result
    }
}

fun main() {
    val solution1 = Solution().summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)) // ["0->2","4->5","7"]
    val solution2 = Solution().summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9, 11)) // ["0","2->4","6","8->9","11"]
    val solution3 = Solution().summaryRanges(intArrayOf(1, 3, 4, 5, 9, 11, 12)) // ["1","3->5","9","11->12"]
    val solution4 = Solution().summaryRanges(intArrayOf(1, 2, 3, 4, 5, 6)) // ["1->6"]
    val solution5 = Solution().summaryRanges(intArrayOf(1)) // ["1"]

    println(solution1)
    println(solution2)
    println(solution3)
    println(solution4)
    println(solution5)
}