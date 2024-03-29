package _Yandex._1_linear_search

import kotlin.math.max
import kotlin.math.min

/*
     Метро

    На некоторых кросс-платформенных станциях метро на разные стороны платформы
    приходят поезда разных направлений. Таня договорилась встретиться с подругой на такой станции,
    но поскольку подруга приехала из другого часового пояса, то из-за
    джетлага сильно проспала и Тане пришлось долго ждать её. Поезда всегда ходят точно
    по расписанию и Таня знает, что поезд стоит на платформе ровно 1 минуту, а интервал между поездами
    составляет "а" минут для поездов на первом пути и "b" минут для поездов на втором пути. То есть
    на первый путь приезжает поезд и стоит одну минуту, затем в течение "a" минут поезда у платформы нет,
    затем в течение минуты у платформы стоит следующий поезд и тд.

    Пока Таня стояла на платформе, она насчитала n поездов на первом пути и m поездов на втором пути.
    Определите минимальное и максимальное время, которое Таня могла провести на платформе или сообщите,
    что она точно сбилась со счета.

    Все поезда, которые видела Таня, она наблюдала в течение всей минуты, то есть Таня не приходит
    и не уходит с платформы посередине той минуты, когда поезд стоит на платформе

*/

fun main() {
    solution(1, 3, 3, 2)
}

private fun solution(a: Int, b: Int, n: Int, m: Int) {
    val min1 = minTime(n, a)
    val max1 = maxTime(n, a)

    val min2 = minTime(m, b)
    val max2 = maxTime(m, b)

    val min = max(min1, min2)
    val max = min(max1, max2)

    if (min < max) println("$min $max")
    else println(-1)
}

private fun minTime(trains: Int, interval: Int) = (interval * (trains - 1)) + trains

private fun maxTime(trains: Int, interval: Int) = (interval * (trains + 1)) + trains