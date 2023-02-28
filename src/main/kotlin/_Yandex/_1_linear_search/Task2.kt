package _Yandex._1_linear_search

/*
    Дана последовательность чисел длинной N.
    Найти последнее(правое) вхождение положительного числа Х в нее или вывести -1, если число Х не встречалось.
*/

private fun solution(nums: IntArray, target: Int): Int {
    var result = -1
    nums.forEachIndexed { index, i ->
        if (i == target) result = index
    }
    return result
}

fun main() {
    val solution1 = solution(intArrayOf(1, 2, 2, 3, 3), 3)
    val solution2 = solution(intArrayOf(7, 2, 7, 4, 5), 7)
    val solution3 = solution(intArrayOf(7, 2, 7, 4, 5), 4)
    val solution4 = solution(intArrayOf(7, 2, 7, 4, 5), 0)

    println(solution1) // 4
    println(solution2) // 2
    println(solution3) // 3
    println(solution4) // -1
}