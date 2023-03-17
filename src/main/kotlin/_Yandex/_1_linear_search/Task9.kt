package _Yandex._1_linear_search

/*
     Узник замка Иф

     За многие годы заточения замка Иф проделал в стене
     прямоугольное отверстие размером DxE. Замок Иф сложен из кирпичей,
     размером AxBxC.

     Определите, сможет ли узник выбрасывать кирпичи в
     море через это отверстие, если стороны кирпича должны быть
     параллельны сторонам отверстия
*/

fun solution(wall: Array<Int>, brick: Array<Int>): Boolean {
    var a = brick[0]
    var b = brick[1]
    var d = wall[0]
    var e = wall[1]
    sort(a, b).run {
        a = first
        b = second
    }
    sort(b, brick[2]).run {
        b = first
    }
    sort(a, b).run {
        a = first
        b = second
    }
    sort(d, e).run {
        d = first
        e = second
    }
    return a <= e && b <= d
}

private fun sort(first: Int, second: Int): Pair<Int, Int> =
    if (first < second) Pair(first, second)
    else Pair(second, first)

fun main() {
    val wal = arrayOf(2, 2)
    val brick1 = arrayOf(2, 2, 2)
    val brick2 = arrayOf(3, 3, 1)
    val brick3 = arrayOf(3, 3, 3)
    val brick4 = arrayOf(8, 2, 2)

    val solution1 = solution(wal, brick1)
    val solution2 = solution(wal, brick2)
    val solution3 = solution(wal, brick3)
    val solution4 = solution(wal, brick4)

    println(solution1) // true
    println(solution2) // false
    println(solution3) // false
    println(solution4) // true
}