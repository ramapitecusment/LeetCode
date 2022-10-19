package _Top_100_Liked_Questions._14_Longest_Common_Prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String? {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        for (i in 1 until strs.size) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix.isEmpty()) return ""
            }
        }
        return prefix
    }
}

fun main() {
    val solution1 = Solution().longestCommonPrefix(arrayOf("flower", "flow", "flight")) // "fl"
    val solution2 = Solution().longestCommonPrefix(arrayOf("dog", "racecar", "car")) // ""
    val solution3 = Solution().longestCommonPrefix(arrayOf("ab", "a")) // "a"

    println(solution1)
    println(solution2)
    println(solution3)
}