package leetcode_ds_course._2_hashing._1_checking_existence

import Assert.Assert.assertEquals

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val difMap = mutableMapOf<Int, Int>() // key is the difference between target and value

        nums.forEachIndexed { index, value ->
            if (difMap[value] != null) return intArrayOf(difMap[value]!!, index)
            else difMap[target - value] = index
        }

        return intArrayOf()
    }

}

fun main() {
    val solution1 = TwoSum().twoSum(intArrayOf(5, 2, 7, 10, 3, 9), 8)

    assertEquals(listOf(0, 4), solution1.toList())
}