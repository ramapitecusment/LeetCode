package _Yandex._1_linear_search

import java.lang.IllegalStateException

/*
    Дана последовательность числен длинной N (N>1).
    Найти максимальное число в последовательности и второе по величине число (такое, которое будет максимальным, если
    вычеркнуть из последовательности одно максимальное число)
*/

private fun solution(nums: IntArray): Pair<Int, Int> {
    if (nums.size < 2) throw IllegalStateException("Sequence size must be grater than 2")
    var max1: Int
    var max2: Int
    if (nums[0] >= nums[1]) {
        max1 = 0
        max2 = 1
    } else {
        max1 = 1
        max2 = 0
    }
    for (index in 2 until nums.size) {
        if (nums[index] > nums[max1]) {
            max2 = max1
            max1 = index
        } else if (nums[index] > nums[max2]) {
            max2 = index
        }
    }
    return Pair(nums[max1], nums[max2])
}

fun main() {
    val solution1 = solution(intArrayOf(1, 3, 1, 2, 5))
    val solution2 = solution(intArrayOf(7, 3, 1, 7, 2, 2))
    val solution3 = solution(intArrayOf(1, 3, 6, 5, 2, 2))
    val solution4 = solution(intArrayOf(1, 1))
    val solution5 = solution(intArrayOf(1, 0))
    val solution6 = solution(intArrayOf(0, 1))

    println(solution1) // 5 3
    println(solution2) // 7 7
    println(solution3) // 6 5
    println(solution4) // 1 1
    println(solution5) // 1 0
    println(solution6) // 0 1
}