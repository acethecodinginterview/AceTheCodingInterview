public class Solution {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode pointer1 = l1;
		ListNode pointer2 = l2;

		ListNode result = new ListNode(0);
		ListNode resultPointer = result;

		int sum = 0;
		int digit = 0;
		int carryover = 0;

		while(pointer1 != null || pointer2 != null || carryover != 0) {
			resultPointer.next = new ListNode(0);
			resultPointer = resultPointer.next;

			sum = 0;

			if(pointer1 != null) {
				sum = sum + pointer1.val;
				pointer1 = pointer1.next;
			}

			if(pointer2 != null) {
				sum = sum + pointer2.val;
				pointer2 = pointer2.next;
			}

			sum = sum + carryover;

			digit = sum % 10;
			carryover = sum/10;

			resultPointer.val = digit;
		}

		return result.next;
	}

	public static void main(String[] args) {
		ListNode l1_1 = new ListNode(2);
		ListNode l1_2 = new ListNode(4);
		ListNode l1_3 = new ListNode(3);
		l1_1.next = l1_2;
		l1_2.next = l1_3;

		ListNode l2_1 = new ListNode(5);
		ListNode l2_2 = new ListNode(6);
		ListNode l2_3 = new ListNode(4);
		l2_1.next = l2_2;
		l2_2.next = l2_3;

		ListNode result = addTwoNumbers(l1_1, l2_1);

		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}	
	}

}
