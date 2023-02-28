package _Yandex._1_linear_search

/*
    Дана последовательность чисел длинной N.
    Найти первое(левое) вхождение положительного числа Х в нее или вывести -1, если число Х не встречалось.
*/

private fun solution(nums: IntArray, target: Int): Int {
    nums.forEachIndexed { index, i ->
        if (i == target) return index
    }
    return -1
}

fun main() {
    val solution1 = solution(intArrayOf(1, 2, 2, 3, 3), 3)
    val solution2 = solution(intArrayOf(1, 2, 7, 4, 5), 7)

    println(solution1) // -1
    println(solution2) // 2
}