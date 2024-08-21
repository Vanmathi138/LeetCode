class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next; // Save the next node
            curr.next = prev;          // Reverse the current node's pointer
            prev = curr;               // Move prev to the current node
            curr = next;               // Move to the next node
        }
        return prev; // New head of the reversed list
    }

    public static void main(String[] args) {
        // Example usage:
        ReverseLinkedList206 solution = new ReverseLinkedList206();

        // Creating a sample list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Reversing the list
        ListNode reversedHead = solution.reverseList(head);

        // Printing the reversed list
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " -> ");
            reversedHead = reversedHead.next;
        }
        System.out.println("null");
    }
}
