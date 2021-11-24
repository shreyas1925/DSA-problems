package linkedlist;

import linkedlist.LL.Node;

public class DLL {
	
	Node head;
	int size;
	
	public DLL()
	{
		this.size=0;
	}

	
	public void insertFirst(int value)
	{
		Node node = new  Node(value);
		node.next=head;
		node.prev=null;
		
		if(head!=null)
		{
			head.prev=node;
		}
		
		head=node;
		size++;
		
	}
	
	public void insertLast(int value)
	{
		Node node = new Node(value);
		
		Node temp = head;
		
		node.next=null;
		
		if(head==null)
		{
			node.prev=head;
			node=head;
			return;
		}
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		node.prev=temp;
		temp.next=node;
		size++;
	}
	
	public int deleteLast()
	{
		Node temp = get(size-1);
		int val = temp.next.value;
		temp.next=null;
		return val;
	}
	
	public Node get(int index)
	{
		Node temp = head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		
		return temp;
		
	}
	
	public void display()
	
	{
		Node temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.value + " -> ");
			temp=temp.next;
		}
		
		System.out.println("END");
	}
	
	public void displayReverse()
	{
		Node temp = head;
		Node last = null;
		
		while(temp!=null)
		{
			last=temp;
			temp=temp.next;
		}
		
		while(last!=null)
		{
			System.out.print(last.value + " -> ");
			last=last.prev;
		}
		
		System.out.println("START");
	}
	

	public class Node{
		
		int value;
		Node next;
		Node prev;
		
		Node(int value)
		{
			this.value=value;
		}
		
		Node(int value,Node next,Node prev)
		{
			this.value=value;
			this.next=next;
			this.prev=prev;
		}
		
	}


}
