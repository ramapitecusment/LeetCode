package _Yandex._1_linear_search

import java.lang.StringBuilder

/*

    Дана строка, возможно пустая, состоящая из букв A-Z.
    AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB

    Нужно написать функцию RLE, которая на выходе даст строку вида:
    A4B3C2XYZD4E3F3A6B28.

    Пояснение:
    Если символ встречается один раз, то он остается без изменений.
    Если символ повторяется более 1 раз, к нему
    добавляется количество повторений

*/

fun solution(text: String): String {
    var curChar = text[0]
    var counter = 0
    val builder = StringBuilder()
    builder.append(curChar)
    for (i in 1 until text.length) {
        if (text[i] != curChar) {
            curChar = text[i]
            if (counter > 1) builder.append(counter)
            builder.append(curChar)
            counter = 0
        }
        counter++
    }

    if (counter > 1) builder.append(counter)

    return builder.toString()
}

fun main() {
    val solution1 = solution("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBA")

    println(solution1) // A4B3C2XYZD4E3F3A6B28A
}