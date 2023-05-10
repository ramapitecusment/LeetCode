package leetcode_ds_course._1_Strings_And_Arrays._3_prefix_sum

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4503/

Example 1: Given an integer array nums, an array queries where queries[i] = [x, y] and an integer limit,
return a boolean array that represents the answer to each query.
A query is true if the sum of the subarray from x to y is less than limit, or false otherwise.

For example, given nums = [1, 6, 3, 2, 7, 2] and queries = [[0, 3], [2, 5], [2, 4]]
and limit = 13, the answer is [true, false, true]. For each query, the subarray sums are [12, 14, 12].

/////////////////////////////////////////////////////////////////////////////////////////////////////

Without the prefix sum, answering each query would be O(n) in the worst case, where n is the length of nums.
If m = queries.length, that would give a time complexity of O(n∗m). With the prefix sum, it costs O(n)
to build, but then answering each query is O(1). This gives a much better time complexity of O(n+m).
We use O(n) space to build the prefix sum.

Run in O(n+m) and Space O(n)

*/

class SubArraySumLimit {
    fun answerQueries(nums: IntArray, queries: Array<IntArray>, limit: Int): BooleanArray {
        val sumArray = IntArray(nums.size)
        val result = BooleanArray(queries.size)
        sumArray[0] = nums[0]
        for (i in 1 until nums.size) {
            sumArray[i] = nums[i] + sumArray[i - 1]
        }
        for (i in queries.indices) {
            val p1 = queries[i][0]
            val p2 = queries[i][1]
            result[i] = (sumArray[p2] - sumArray[p1] + nums[p1]) < limit
        }
        return result
    }
}

fun main() {
    val solution = SubArraySumLimit().answerQueries(
        intArrayOf(1, 6, 3, 2, 7, 2),
        arrayOf(intArrayOf(0, 3), intArrayOf(2, 5), intArrayOf(2, 4)),
        13
    )

    solution.forEach(::println) // [true, false, true]

}