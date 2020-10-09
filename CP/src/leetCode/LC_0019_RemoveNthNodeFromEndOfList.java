package leetCode;

public class LC_0019_RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null)
			return null;
		int h = helper(head, n);
		if (h == 0)
			return head.next;
		return head;
	}

	public int helper(ListNode node, int n) {
		if (node.next == null)
			return n - 1;
		if (n == 1 && node.next.next == null) {
			node.next = null;
			return -1;
		}

		int stepL = helper(node.next, n) - 1;
		if (stepL != 0)
			return stepL;

		node.val = node.next.val;
		node.next = node.next.next;
		return -1;
	}
}
