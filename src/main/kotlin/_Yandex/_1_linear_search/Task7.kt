package _Yandex._1_linear_search

import kotlin.math.max

/*
    Игра PirCraft происходит в двумерном мире, который состоит
    из блоков размером 1 на 1 метр. Остров игрока представляет
    собой набор столбцов различной высота, состоящих из блоков
    камня и окруженный морем. Над островом прошел сильный дождь
    который заполнил водой все низины, а не поместившаяся в них
    вода стекла в море, не увеличив его уровень

    По ландшафту острова определите сколько блоков воды осталось
    после дождя в низинах на острове
*/

fun solution(island: Array<Int>): Int {
    var result = 0
    var maxPos = 0
    island.forEachIndexed { index, value ->
        if (value > maxPos) maxPos = index
    }
    var curMax = 0
    for (i in 0 until maxPos) {
        if (island[i] > curMax) curMax = island[i]
        else result += curMax - island[i]
    }
    curMax = 0
    for (i in island.size - 1 downTo maxPos) {
        if (island[i] > curMax) curMax = island[i]
        else result += curMax - island[i]
    }
    return result
}

fun main() {
    val solution1 = solution(arrayOf(3, 1, 4, 3, 5, 1, 1, 3, 1)) // 7
    val solution2 = solution(arrayOf(3, 2, 5, 2, 2, 5, 2, 2, 3)) // 9
    val solution3 = solution(arrayOf(3, 2, 5, 2, 2, 5, 2, 2, 3, 3, 2, 3)) // 10

    println(solution1)
    println(solution2)
    println(solution3)
}
