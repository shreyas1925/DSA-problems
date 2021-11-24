package linkedlist;

public class LL {
		
		Node head;
		Node tail;
		int size;
		
		public LL()
		{
			this.size=0;
		}
		
		public void insertFirst(int val)
		{
			Node node = new Node(val);
			node.next=head;
			head=node;
			
			if(tail==null)
			{
				tail=head;
			}
			
			size++;
		}
		
		public void insertLast(int val)
		{
			Node node = new Node(val);
			tail.next=node;
			node=tail;
			size++;
		}
		
		public void insert(int val,int index)
		{
		
			if (index == 0) {
	            insertFirst(val);
	            return;
	        }
	        if (index == size) {
	            insertLast(val);
	            return;
	        }

//	        Node temp = head;
//	        for (int i = 1; i < index; i++) {
//	            temp = temp.next;
//	        }

	        Node node = new Node(val);
	        Node temp = get(1);
	        node.next=temp.next;
	        temp.next = node;
	        size++;
		}
		
//		Deletion part
		
		public int deleteFirst()
		{
			int val = head.value;
			
			head=head.next;
			
			return val;
		}
		
		public int deleteLast()
		{
			int val = tail.value;
			
			Node temp = get(size-2);
			tail=temp.next;
			temp.next=null;
			
			return val;
		}
		
		public int delete(int index)
		{
			if(index==0)
			{
				return deleteFirst();
			}
			
			if(index==size)
			{
				return deleteLast();
			}
			
			Node temp = get(index);
			int val = temp.next.value;
			
			temp.next=temp.next.next;
			
			return val;
		}
		
		
		public void deleteDuplicate()
		
		{
			Node temp = head;
			
			while(temp!=null)
			{
				
					if(temp.value==temp.next.value)
					{
						temp.next=temp.next.next;
					}
				
			}
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
	            temp = temp.next;
			}
			
			System.out.println("END");	
			
		}

		
		public class Node{
			
			int value;
			Node next;
			
			Node(int value)
			{
				this.value=value;
			}
			
			Node(int value,Node next)
			{
				this.value=value;
				this.next=next;
			}
			
		}

	}



