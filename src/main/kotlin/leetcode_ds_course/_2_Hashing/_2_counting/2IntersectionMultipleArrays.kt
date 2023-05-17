package leetcode_ds_course._2_hashing._2_counting

import Assert.Assert.assertEquals
import java.util.*


/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4512/

Example 2: 2248. Intersection of Multiple Arrays

Given a 2D array nums that contains n arrays of distinct integers, return a sorted array containing all the numbers that appear in all n arrays.

For example, given nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]], return [3, 4]. 3 and 4 are the only numbers that are in all arrays.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Let's say that there n lists and each list has an average of m elements.
To populate our hash map, it costs O(n⋅m) to iterate over all the elements.
Then, there can be at most m elements inside ans when we perform the sort, which means in the worst case, the sort will cost O(m⋅logm).
This gives us a time complexity of O(n⋅m+m⋅logm)=O(m⋅(n+logm)).
If every element in the input is unique, then the hash map will grow to a size of n⋅m, which means the algorithm has a space complexity of O(n⋅m).

Run in O(m⋅(n+logm)) and Space O(n*m)

*/

class IntersectionMultipleArrays {

    fun intersection(nums: Array<IntArray>): List<Int> {
        val map = mutableMapOf<Int, Int>()
        val ans = mutableListOf<Int>()

        nums.forEach { array ->
            array.forEach {
                map[it] = map.getOrDefault(it, 0) + 1
            }
        }

        map.forEach { (key, value) ->
            if (value == nums.size) ans.add(key)
        }

        ans.sort()

        return ans
    }

}

fun main() {
    val solution1 = IntersectionMultipleArrays().intersection(
        arrayOf(
            intArrayOf(3, 1, 2, 4, 5),
            intArrayOf(1, 2, 3, 4),
            intArrayOf(3, 4, 5, 6)
        )
    )

    assertEquals(listOf(3, 4), solution1)
}