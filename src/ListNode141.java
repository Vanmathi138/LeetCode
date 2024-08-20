public class ListNode141 {
    int val;
    ListNode141 next;
    ListNode141(int x) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode141 node1 = new ListNode141(1);
        ListNode141 node2 = new ListNode141(2);
        ListNode141 node3 = new ListNode141(0);
        ListNode141 node4 = new ListNode141(-4);

        // Link nodes to form a list: 1 -> 2 -> 0 -> -4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Uncomment the line below to create a cycle
        // node4.next = node2; // Creates a cycle: 1 -> 2 -> 0 -> -4 -> 2 ...

        // Create Solution instance
        ListNodeSolution solution = new ListNodeSolution();

        // Check if the linked list has a cycle
        boolean result = solution.hasCycle(node1);

        // Print the result
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
            return false; // If the list is empty or has only one node, no cycle.
        }

        ListNode141 slow = head;
        ListNode141 fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // If fast reaches the end, no cycle.
            }
            slow = slow.next;       // Move slow pointer by one step.
            fast = fast.next.next;  // Move fast pointer by two steps.
        }

        return true; // If slow and fast meet, cycle detected.
    }
}
