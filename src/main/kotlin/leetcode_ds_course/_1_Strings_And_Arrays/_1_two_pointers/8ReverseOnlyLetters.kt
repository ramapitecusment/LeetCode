package leetcode_ds_course._1_Strings_And_Arrays._1_two_pointers

import Assert.Assert.assertEquals

/*

https://leetcode.com/problems/reverse-only-letters/

Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

/////////////////////////////////////////////////////////////////////////////////////////////////////



*/

class ReverseOnlyLetters {

    private var capitalLetterIndices = 65..90
    private var smallLetterIndices = 97..122

    fun reverseOnlyLetters(s: String): String {
        val ans = s.toCharArray()
        var p0 = 0
        var p1 = s.length - 1

        while (p0 < p1) {
            if (isEnglishLetter(s[p0]) && isEnglishLetter(s[p1])) {
                ans[p0] = s[p1]
                ans[p1] = s[p0]
                p0++
                p1--
            } else {
                if (!isEnglishLetter(s[p0])) p0++
                if (!isEnglishLetter(s[p1])) p1--
            }
        }

        return String(ans)
    }

    private fun isEnglishLetter(char: Char): Boolean = char in 'a'..'z' || char in 'A'..'Z'

}

fun main() {
    val solution1 = ReverseOnlyLetters().reverseOnlyLetters("ab-cd")
    val solution2 = ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj")
    val solution3 = ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!")
    val solution4 = ReverseOnlyLetters().reverseOnlyLetters("!-!=-")
    val solution5 = ReverseOnlyLetters().reverseOnlyLetters("!")
    val solution6 = ReverseOnlyLetters().reverseOnlyLetters("!=")
    val solution7 = ReverseOnlyLetters().reverseOnlyLetters("A!=")
    val solution8 = ReverseOnlyLetters().reverseOnlyLetters("A!=B")
    val solution9 = ReverseOnlyLetters().reverseOnlyLetters("!=B")
    val solution10 = ReverseOnlyLetters().reverseOnlyLetters("7_28]")

    assertEquals("dc-ba", solution1)
    assertEquals("j-Ih-gfE-dCba", solution2)
    assertEquals("Qedo1ct-eeLg=ntse-T!", solution3)
    assertEquals("!-!=-", solution4)
    assertEquals("!", solution5)
    assertEquals("!=", solution6)
    assertEquals("A!=", solution7)
    assertEquals("B!=A", solution8)
    assertEquals("!=B", solution9)
    assertEquals("7_28]", solution10)
}