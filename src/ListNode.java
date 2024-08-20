public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one node, no cycle.
        }

        ListNode slow = head;
        ListNode fast = head.next;

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
