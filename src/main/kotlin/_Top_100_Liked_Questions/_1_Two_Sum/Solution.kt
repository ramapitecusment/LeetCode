package _Top_100_Liked_Questions._1_Two_Sum

// https://leetcode.com/problems/two-sum/

class Solution {
    
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val difMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, value ->
            val dif = target - value
            if (difMap[value] != null) return intArrayOf(difMap[value]!!, index)
            else difMap[dif] = index
        }
        return intArrayOf()
    }

}

fun main() {
    val solution1 = Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)
    println(solution1[0].toString() + " " + solution1[1].toString())

    val solution2 = Solution().twoSum(intArrayOf(3, 2, 4), 6)
    println(solution2[0].toString() + " " + solution2[1].toString())

    val solution3 = Solution().twoSum(intArrayOf(3, 3), 6)
    println(solution3[0].toString() + " " + solution3[1].toString())
}