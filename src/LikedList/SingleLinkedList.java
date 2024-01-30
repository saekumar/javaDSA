package LikedList;



public class SingleLinkedList {
	
	private class Node {
		private int value;
		private Node next;
		public Node(int value, Node next) {
			
			this.value = value;
			this.next = next;
		}
		public Node(int value) {
			this.value = value;
			
		}
		
		
	}
	private Node head;
	private Node tail;
	private int size;
	public SingleLinkedList()
	{
		this.size =0;
	}
	
	public void insertFirst(int val)
	{
		Node node = new Node(val);
		node.next=head;
		head = node;
		if(tail==null)
		{
			tail=head;
		}
		size+=1;
	}
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.print("end");
	}
	public void insertLast(int val)
	{

		
		
		if(tail==null)
		{
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}
	public void insert(int val,int index)
	{
		if(index ==0)
		{
			insertFirst(val);
			return;
		}
		if(index==size)
		{
			insertLast(val);
			return;
		}
		Node node = new Node(val);
		Node temp = head;
		Node temp2;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		temp2=temp.next;
		temp.next=node;
		node.next=temp2;
		size++;
	}
	public int deleteFirst()
	{
		int value = head.value;
		head=head.next;
		if(head == null)
		{
			tail=head;
		}
		size--;
		return value;
	}
	public Node get(int index)
	{
		Node node = head;
		for(int i=0;i<index;i++)
		{
			node=node.next;
		}
		return node;
	}
	public Node find(int value)
	{
		Node node = head;
		while(node!=null)
		{
			if(node.value == value)
			{
				return node;
			}
			node = node.next;
		}
		return null;
	}
	public int deleteLast()
	{
		Node secondLast = get(size-2);
		int value = tail.value;
		tail=secondLast;
		tail.next=null;
		
		
		
		
		size--;
		return value;
	}
	public int deleteByIndex(int index)
	{
		Node indexPointer = get(index-1);
	  Node te = head;
	  for(int i=1;i<index;i++)
	  {
		  te=te.next;
	  }
	  int value = indexPointer.value;
	  te.next=indexPointer.next;
	  indexPointer.next=null;
		
		
		
		size--;
		return value;
		
	}

	

}

