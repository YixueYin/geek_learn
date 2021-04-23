package Week1;

// Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //尝试使用递归
        //递归的本质思想就是，加一个终止条件
        //然后，每次都让较小的那个元素指向其他所有元素
        if(l1 == null) {
            return l2;
        }else if(l2 == null) {
            return l1;
        }else if(l1.val<l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }


// //双指针，依次比较
//         //迭代，虽然加了对于异常情况的分析比较丑，但是是自己的独立思路
//         if(l1 == null && l2 != null) {
//             return l2;
//         }else if(l1 !=null && l2 == null){
//             return l1;
//         }else if(l1 == null && l2 == null){
//             return l1;
//         }
//         Week1.ListNode dummyhead = new Week1.ListNode(0);
//         if(l1.val>l2.val) {
//             dummyhead.next = l2;
//             l2 = l2.next;
//         }else {
//             dummyhead.next = l1;
//             l1 = l1.next;
//         }
//         Week1.ListNode cur = dummyhead.next;
//         while(l1!=null && l2!=null) {
//             if(l1.val > l2.val) {
//                 cur.next = l2;
//                 l2 = l2.next;
//             }else {
//                 cur.next = l1;
//                 l1 = l1.next;
//             }
//             cur = cur.next;
//         }
//         if(l1 == null) {
//             cur.next = l2;
//         } else {
//             cur.next = l1;
//         }
//         return dummyhead.next;
    
}
