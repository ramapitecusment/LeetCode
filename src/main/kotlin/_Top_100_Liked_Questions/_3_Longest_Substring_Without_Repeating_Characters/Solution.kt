package _Top_100_Liked_Questions._3_Longest_Substring_Without_Repeating_Characters

// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {

//    private var answer = mutableSetOf<Char>()
//
//    fun lengthOfLongestSubstring(s: String): Int {
//        findLongestSubstring(s)
//        return answer.size
//    }
//
//    private fun findLongestSubstring(s: String) {
//        val map = mutableMapOf<Char, Int>()
//        s.forEachIndexed { index, char ->
//            if (map[char] == null) map[char] = index
//            else {
//                val wordSet = map.keys
//                if (answer.size <= wordSet.size) {
//                    answer = wordSet
//                }
//                findLongestSubstring(s.substring(map[char]!!+1))
//                return
//            }
//        }
//        if (answer.size <= map.keys.size) answer = map.keys
//    }

    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var right = 0
        var max = 0
        val set: MutableSet<Char> = HashSet()
        while (right < s.length) {
            if (!set.contains(s[right])) {
                set.add(s[right++])
                max = max.coerceAtLeast(set.size)
            } else {
                set.remove(s[left++])
            }
        }
        return max
    }
}

fun main() {
    val solution1 = Solution().lengthOfLongestSubstring("abcabcbb") // 3
    val solution2 = Solution().lengthOfLongestSubstring("bbbbb") // 1
    val solution3 = Solution().lengthOfLongestSubstring("pwwkew") // 3
    val solution4 = Solution().lengthOfLongestSubstring(" ") // 1
    val solution5 = Solution().lengthOfLongestSubstring("au") // 2
    val solution6 = Solution().lengthOfLongestSubstring("aab") // 2
    val solution7 = Solution().lengthOfLongestSubstring("dvdf") // 3
    val solution8 = Solution().lengthOfLongestSubstring("cdd") // 2
    val solution9 = Solution().lengthOfLongestSubstring("jbpnbwwd") // 4
    val solution10 = Solution().lengthOfLongestSubstring("hkcpmprxxxqw") // 5

    println(solution1)
    println(solution2)
    println(solution3)
    println(solution4)
    println(solution5)
    println(solution6)
    println(solution7)
    println(solution8)
    println(solution9)
    println(solution10)
}