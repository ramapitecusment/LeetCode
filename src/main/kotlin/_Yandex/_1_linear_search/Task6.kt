package _Yandex._1_linear_search

import java.lang.StringBuilder

/*
    Дана последовательность слов.
    Вывести самые короткие слова через пробел
*/

private fun solution(words: Array<String>): String {
    var minLen = words[0].length
    val builder = StringBuilder()
    words.forEach {
        if (it.length < minLen) minLen = it.length
    }
    words.forEach {
        if (it.length == minLen) builder.append("$it ")
    }
    return builder.toString()
}

fun main() {
    val solution1 = solution(arrayOf("вдруг", "как", "в", "сказке", "я", "скрипнула", "дверь"))
    println(solution1)
}