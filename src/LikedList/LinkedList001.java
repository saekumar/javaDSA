package LikedList;


public class LinkedList001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		
//		SingleLinkedList list = new SingleLinkedList();
//		list.insertFirst(12);
//		list.insertFirst(45);
//		list.insertFirst(125);
//		list.insertFirst(455);
//		list.insertLast(567);
//		list.insert(56, 3);
//		list.display();
//		System.out.println();
//		
//		list.deleteLast();
//		list.display();
//		System.out.println(list.find(125));
		
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(12);
		list.insertFirst(45);
		
		list.insertFirst(125);
		list.insertFirst(455);
		list.display();
		list.reverse();

	}

}
