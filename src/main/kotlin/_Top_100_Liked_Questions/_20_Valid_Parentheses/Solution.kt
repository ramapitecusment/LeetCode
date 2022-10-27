package _Top_100_Liked_Questions._20_Valid_Parentheses

import java.util.*


class Solution {

    private val brackets = hashMapOf(
        '(' to ')', '[' to ']', '{' to '}'
    )


//    fun isValid(s: String): Boolean {
//        val stack = ArrayDeque<Char>()
//
//        s.forEach {
//            if (brackets.keys.contains(it)) stack.add(it)
//            else if (brackets[stack.lastOrNull()] == it) stack.removeLast()
//            else return false
//        }
//        return stack.isEmpty()
//    }

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        s.forEach {
            if (brackets.keys.contains(it)) stack.push(it)
            else if (brackets[stack.lastOrNull()] == it) stack.pop()
            else return false
        }
        return stack.isEmpty()
    }

//    fun isValid(s: String): Boolean {
//        val stack = Stack<Char>()
//        if (s.length % 2 != 0) return false
//        for (c in s.toCharArray()) {
//            if (c == '(') stack.push(')')
//            else if (c == '{') stack.push('}')
//            else if (c == '[') stack.push(']')
//            else if (stack.isEmpty() || stack.pop() != c) return false
//        }
//        return stack.isEmpty()
//    }

//    fun isValid(brackets: String): Boolean {
//        var s = brackets
//        while (s.indexOf("{}") != -1 || s.indexOf("[]") != -1 || s.indexOf("()") != -1) {
//            s = s.replace("()", "")
//            s = s.replace("[]", "")
//            s = s.replace("{}", "")
//        }
//        return s.isEmpty()
//    }
}

fun main() {
    val solution1 = Solution().isValid("()") // true
    val solution2 = Solution().isValid("{[]}") // true
    val solution3 = Solution().isValid("()[]{}") // true
    val solution4 = Solution().isValid("(]") // false
    val solution5 = Solution().isValid("){") // false
    val solution6 = Solution().isValid("{[}}") // false
    val solution7 = Solution().isValid("([}}])") // false

    println(solution1)
    println(solution2)
    println(solution3)
    println(solution4)
    println(solution5)
    println(solution6)
    println(solution7)
}