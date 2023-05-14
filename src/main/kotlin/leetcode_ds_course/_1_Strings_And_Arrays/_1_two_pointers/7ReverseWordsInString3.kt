package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals

/*

https://leetcode.com/problems/reverse-words-in-a-string-iii/

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

/////////////////////////////////////////////////////////////////////////////////////////////////////

Run in O(n) and Space O(1)

*/


class ReverseWordsInString3 {

//    fun reverseWords(s: String): String {
//        val ans = StringBuilder()
//        var p0 = 0
//        var p1 = 0
//        for (i in s.indices) {
//            if (s[i] == ' ') {
//                p0 = p1
//                p1 = i - 1
//                while (p1 >= p0) {
//                    ans.append(s[p1])
//                    p1--
//                }
//                p1 = i + 1
//                ans.append(s[i])
//            } else if (i == s.length - 1) {
//                p0 = p1
//                p1 = i
//                while (p1 >= p0) {
//                    ans.append(s[p1])
//                    p1--
//                }
//                p1 = i
//            }
//        }
//
//        return ans.toString()
//    }

    /*

    Time Complexity: O(N). Every character in the string is traversed twice.
    First, to find the end of the current word, and second to reverse the word and append it to the result.
    Thus the time complexity is, O(N+N)=O(N).

    Space Complexity: O(1). We use constant extra space to track the last space index.
    You could also argue that we are using O(n) space to build the output string
    (we normally don't count the output as part of the space complexity, but in this case we are temporarily using some space to build it).

    */
//    fun reverseWords(s: String): String {
//        val ans = StringBuilder()
//        var lastSpaceIndex = -1
//        var curr = 0
//        for (i in s.indices) {
//            if (s[i] == ' ' || i == s.length - 1) {
//                if (s[i] == ' ') {
//                    curr = i - 1
//                } else if (i == s.length - 1) {
//                    curr = i
//                }
//                while (curr > lastSpaceIndex) {
//                    ans.append(s[curr--])
//                }
//                if (s[i] == ' ') {
//                    ans.append(' ')
//                    lastSpaceIndex = i
//                }
//            }
//
//        }
//
//        return ans.toString()
//    }

    /*

    Complexity Analysis

    Let NNN be the length of string s.

    Time Complexity: O(N) The outer loop iterates over N characters to find the start and end index of every word.
    The algorithm to reverse the word also iterates N times to perform N/2 swaps.
    Thus, the time complexity is O(N+N)=O(N)\mathcal{O}(N + N) = {O}(N)O(N+N)=O(N).

    Space Complexity: O(1) We use constant extra space to track the last space index.
    You could also argue that we are using O(n) space to build the output string
    (we normally don't count the output as part of the space complexity, but in this case we are temporarily using some space to build it).

    */
    fun reverseWords(s: String): String {
        val ans = s.toCharArray()
        var lastSpaceIndex = -1
        var p1 = 0
        var p2 = 0
        var temp: Char
        
        for (i in s.indices) {

            if (s[i] == ' ' || i == s.length - 1) {
                p1 = lastSpaceIndex + 1

                if (s[i] == ' ') p2 = i - 1
                else if (i == s.length - 1) p2 = i

                while (p1 < p2) {
                    temp = ans[p1]
                    ans[p1] = ans[p2]
                    ans[p2] = temp
                    p1++
                    p2--
                }

                if (s[i] == ' ') lastSpaceIndex = i

            }
        }

        return String(ans)
    }

}

fun main() {
    val solution1 = ReverseWordsInString3().reverseWords("Let's take LeetCode contest")
    val solution2 = ReverseWordsInString3().reverseWords("Let's take LeetCode contest ")
    val solution3 = ReverseWordsInString3().reverseWords(" Let's take LeetCode contest ")
    val solution4 = ReverseWordsInString3().reverseWords("God Ding")
    val solution5 = ReverseWordsInString3().reverseWords("G")
    val solution6 = ReverseWordsInString3().reverseWords(" ")
    val solution7 = ReverseWordsInString3().reverseWords("GodDing")

    assertEquals("s'teL ekat edoCteeL tsetnoc", solution1)
    assertEquals("s'teL ekat edoCteeL tsetnoc ", solution2)
    assertEquals(" s'teL ekat edoCteeL tsetnoc ", solution3)
    assertEquals("doG gniD", solution4)
    assertEquals("G", solution5)
    assertEquals(" ", solution6)
    assertEquals("gniDdoG", solution7)
}