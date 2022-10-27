package _Top_100_Liked_Questions._2_Add_Two_Numbers

// https://leetcode.com/problems/add-two-numbers/

val first = ListNode(9)
val first_ = ListNode(9)
val first__ = ListNode(9)

val second = ListNode(1)

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var summand1 = l1
        var summand2 = l2
        val resultNode = ListNode(0)
        var curr = resultNode
        var additional = 0
        while (summand1 != null || summand2 != null || additional != 0) {
            val first = summand1?.`val` ?: 0
            val second = summand2?.`val` ?: 0
            val sum = first + second + additional
            additional = sum / 10
            summand1 = summand1?.next
            summand2 = summand2?.next
            curr.next = ListNode(sum % 10)
            curr = curr.next!!
        }
        return resultNode.next
    }
}

fun main() {
    first.next = first_
    first_.next = first__
    val solution = Solution().addTwoNumbers(first, second)
    var item = solution
    while (item != null) {
        println(item)
        item = item.next
    }
}