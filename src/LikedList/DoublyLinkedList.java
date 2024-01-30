package LikedList;

public class DoublyLinkedList {
	
	Node head=null;
	Node tail = null;
	public void insertFirst(int val)
	{
		Node node = new Node(val);
		if(head == null)
		{
			head = node;
			tail = head;
		}
		node.next=head;
		node.prev=null;
		head = node;
	}
	public void display()
	{
		Node te = head;
		while(te!=null)
		{
			System.out.print(te.val+" -> ");
			te=te.next;
		}
		System.out.println("END");
	}
	public void reverse()
	{
		Node te = tail;
		while(te!=null)
		{
			System.out.print(te.val+" -> ");
			te = te.prev;
		}
		System.out.println();
	}
	
	private class Node{
		int val;
		Node next;
		Node prev;
		public Node(int val, Node next, Node prev) {
			super();
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		public Node(int val) {
			super();
			this.val = val;
		}
		
		
		
	}
	

}
