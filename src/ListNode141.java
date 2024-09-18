public class ListNode141 {
    int val;
    ListNode141 next;
    ListNode141(int x) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {

        ListNode141 node1 = new ListNode141(1);
        ListNode141 node2 = new ListNode141(2);
        ListNode141 node3 = new ListNode141(0);
        ListNode141 node4 = new ListNode141(-4);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNodeSolution solution = new ListNodeSolution();

        boolean result = solution.hasCycle(node1);
        if (result) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}

class ListNodeSolution {
    public boolean hasCycle(ListNode141 head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode141 slow = head;
        ListNode141 fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
