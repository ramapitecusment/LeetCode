package _Top_100_Liked_Questions._21_Merge_Two_Sorted

import _Top_100_Liked_Questions._2_Add_Two_Numbers.ListNode

val first = ListNode(1)
val first_ = ListNode(2)
val first__ = ListNode(4)

val second = ListNode(1)
val second_ = ListNode(3)
val second__ = ListNode(4)

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var firstList = list1
        var secondList = list2
        val head = ListNode(0)
        var tail = head
        while (firstList != null && secondList != null) {

            if (firstList.`val` <= secondList.`val`) {
                tail.next = firstList
                firstList = firstList.next
            } else {
                tail.next = secondList
                secondList = secondList.next
            }

            tail = tail.next!!

        }

        tail.next = firstList ?: secondList

        return head.next
    }
}

fun main() {
    first.next = first_
    first_.next = first__

    second.next = second_
    second_.next = second__

    val solution = Solution().mergeTwoLists(first, second)

    var item = solution
    while (item != null) {
        println(item)
        item = item.next
    }
}