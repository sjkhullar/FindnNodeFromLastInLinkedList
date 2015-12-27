package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.FindNthNodeFromLast;

public class App 
{
	public static void main( String[] args )
    {
		int[] data = {10, 20, 30, 40, 50};
		Node head = new Node(data[0]);
		for(int count = 1; count < data.length; count++)
			FindNthNodeFromLast.insert(head,data[count]);
		System.out.printf("Linked list is : ");
		FindNthNodeFromLast.print(head);
		int n = 1;
		Node nodeFromLast = FindNthNodeFromLast.findNthNodeFromLast(head,n);
		if(null != nodeFromLast) {
			System.out.printf("Node from last for n = %d is %d",n,nodeFromLast.data);
		}
		n = 3;
		nodeFromLast = FindNthNodeFromLast.findNthNodeFromLast(head,n);
		if(null != nodeFromLast) {
			System.out.printf("\nNode from last for n = %d is %d",n,nodeFromLast.data);
		}
		n = 5;
		nodeFromLast = FindNthNodeFromLast.findNthNodeFromLast(head,n);
		if(null != nodeFromLast) {
			System.out.printf("\nNode from last for n = %d is %d",n,nodeFromLast.data);
		}
    }
}
