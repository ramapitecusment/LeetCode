package _Yandex._1_linear_search

/*
    Дана последовательность чисел длинной N (N>0).
    Найти максимальное число в последовательности
*/

private fun solution(nums: IntArray): Int {
    var result = 0
    nums.forEachIndexed { index, value ->
        if (value > nums[result]) result = index
    }
    return nums[result]
}

fun main() {
    val solution1 = solution(intArrayOf(1, 3, 1, 2, 5))
    val solution2 = solution(intArrayOf(7, 3, 1, 1, 2, 2))
    val solution3 = solution(intArrayOf(1, 3, 6, 1, 2, 2))
    val solution4 = solution(intArrayOf(1))

    println(solution1) // 5
    println(solution2) // 7
    println(solution3) // 6
    println(solution4) // 1
}