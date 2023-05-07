package _LeetCode_All._849_Maximize_Distance_to_Closest_Person

//https://leetcode.com/problems/maximize-distance-to-closest-person/

import kotlin.math.max

class Solution {

    fun maxDistToClosest(seats: IntArray): Int {
        var space = 0
        var maxSpace = 0
        var idx1 = -1
        var idx2 = -1
        val size = seats.size
        seats.forEachIndexed { index, value ->
            if (value == 1) {
                space = 0
                if (idx1 == -1) idx1 = index
                idx2 = index
            } else {
                space++
                if (space >= maxSpace) maxSpace = space
            }
        }
        return max(((maxSpace + 1) / 2), max(idx1, size - 1 - idx2))
    }

}