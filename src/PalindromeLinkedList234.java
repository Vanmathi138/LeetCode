public class PalindromeLinkedList234 {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next; // Save the next node
            curr.next = prev;          // Reverse the current node's pointer
            prev = curr;               // Move prev to the current node
            curr = temp;               // Move to the next node
        }
        return prev; // New head of the reversed list
    }
    public static boolean palindrome(ListNode head){
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;//to store second half of the node
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversedHead = reverse(slow);

        ListNode original = head;
        ListNode reversed = reversedHead;

        while (original!=null && reversed!=null){
            if (original.val != reversed.val)
                return false;
            original=original.next;
            reversed=reversed.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        boolean result = palindrome(n1);
        System.out.println(result);
    }
}
