package _Yandex._1_linear_search

/*
    Дана последовательность числен длинной.
    Найти минимальное четное число в последовательности или вывести -1, если такого не существует
*/

private fun solution(nums: IntArray): Int {
    // Лучше делать через флаг, так как если условие было найти нечетное число, тогда мы могли вывести некорректное значение
    var isFound = false
    var result: Int? = null
    nums.forEach {
        if (it % 2 == 0 && (!isFound || it < result!!)) {
            isFound = true
            result = it
        }
    }
    return if (isFound) result!!
    else -1
}

fun main() {
    val solution1 = solution(intArrayOf(4, 3, 1, 2, 5, 4))
    val solution2 = solution(intArrayOf(2, 3, 1, 7, 3, 2))
    val solution3 = solution(intArrayOf(1, 3, 6, 5, 9, 1))
    val solution4 = solution(intArrayOf(1, 3, 1, 5, 9, 1))
    val solution5 = solution(intArrayOf(1))
    val solution6 = solution(intArrayOf(1, 2))
    val solution7 = solution(intArrayOf(2, 1))
    val solution8 = solution(intArrayOf(0, 1))
    val solution9 = solution(intArrayOf(-2, 1))

    println(solution1) // 2
    println(solution2) // 2
    println(solution3) // 6
    println(solution4) // -1
    println(solution5) // -1
    println(solution6) // 2
    println(solution7) // 2
    println(solution8) // 0
    println(solution9) // -2
}