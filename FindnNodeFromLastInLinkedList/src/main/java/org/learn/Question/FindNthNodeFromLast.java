package org.learn.Question;

import org.learn.List.Node;

public class FindNthNodeFromLast {
	public static Node findNthNodeFromLast(Node head, int n) {
		if (null == head) {
			System.out.println("Single linked list is empty");
			return null;
		}

		Node slow = head;
		Node fast = head;
		int index = 0;
		while (index++ < n) {
			if (null == fast) {
				System.out.printf("\nn=%d is larger than length of linked list", n);
				return null;
			}
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static void insert(Node head, int data) {
		while (head.next != null)
			head = head.next;
		head.next = new Node(data);
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
}
