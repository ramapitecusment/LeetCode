package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

/*

https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4592/

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        var start = 0
        var end = s.size - 1
        while (start < end) {
            val temp = s[start]
            s[start] = s[end]
            s[end] = temp
            start+=1
            end-=1
        }
    }
}

fun main() {
    val charArray1 = charArrayOf('h', 'e', 'l', 'l', 'o')
    val charArray2 = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')

    val solution1 = ReverseString().reverseString(charArray1)
    val solution2 = ReverseString().reverseString(charArray2)

    charArray1.forEach(::print)
    println()
    charArray2.forEach(::print)
}