package leetcode_ds_course._2_hashing._2_counting

import Assert.Assert.assertEquals

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4606/
https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/

You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

Return a list answer of size 2 where:

answer[0] is a list of all players that have not lost any matches.
answer[1] is a list of all players that have lost exactly one match.
The values in the two lists should be returned in increasing order.

Note:

You should only consider the players that have played at least one match.
The testcases will be generated such that no two matches will have the same outcome

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(n)

*/

class FindPlayersWithZeroOrOneLosses {

    fun findWinners(matches: Array<IntArray>): List<List<Int>> {
        val losersCountMap = mutableMapOf<Int, Int>()
        val onlyWinners = mutableListOf<Int>()
        val onlyOneLoose = mutableListOf<Int>()

        matches.forEach {
            val winner = it[0]
            val loser = it[1]
            losersCountMap[winner] = losersCountMap[winner] ?: 0
            losersCountMap[loser] = (losersCountMap[loser] ?: 0) + 1
        }

        losersCountMap.forEach { key, value ->
            if (value == 0) onlyWinners.add(key)
            else if (value == 1) onlyOneLoose.add(key)
        }

        onlyWinners.sort()
        onlyOneLoose.sort()

        return arrayListOf(onlyWinners, onlyOneLoose)
    }

}

fun main() {
    val solution1 = FindPlayersWithZeroOrOneLosses().findWinners(
        arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(3, 6),
            intArrayOf(5, 6),
            intArrayOf(5, 7),
            intArrayOf(4, 5),
            intArrayOf(4, 8),
            intArrayOf(4, 9),
            intArrayOf(10, 4),
            intArrayOf(10, 9),
        )
    )
    val solution2 = FindPlayersWithZeroOrOneLosses().findWinners(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 3),
            intArrayOf(5, 4),
            intArrayOf(6, 4),
        )
    )

    assertEquals(listOf(listOf(1, 2, 10), listOf(4, 5, 7, 8)), solution1)
    assertEquals(listOf(listOf(1, 2, 5, 6), listOf()), solution2)
}