package LinkedList.customLL;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIstCycle_141 {
    static void main() {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        //boolean ans=hasCycle(list);
    }
    /*
    Since list is a container and not a node u cannot do .next .previous or .val operation
    u have to create a custom ll for that
     class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 this i a node and not a list
     */
    /*
    public static boolean hasCycle(List head) {
        if(head==null || head.next==null){
            return false;
        }
        if(head.next==head){
            return true;
        }
        List slow=head;
        Node fast=head.next.next;
        while(fast!=null || fast.next!=null || slow!=null){
            if(fast==slow){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }

     */
}
