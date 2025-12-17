public class node
{ 
	Node head;

    class Node

{

	int data;
	Node next;
	Node (int d)
	{
		data = d;
		next = null;
	}
	 
}

	public void push (int new_data)
	
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	public void insertAfter(Node prev_node,int new_data)
	
	{
		if (prev_node==null)
		{
			System.out.println("The given previous node cannot be null");
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;

}
	public void append(int new_data)
	{
		Node new_data = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	public void insertAfter(Node prev_node,int new_data)
	{
		if (prev_node == null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if (head == null)
		{
			head  = new Node(new_data)
					return;
		}
		new_node.next =null;
		Node last =head ;
		while (last.next !=null)
			last = last.next;
		last.next = new_node;
		return;
		}
	public void printlist()
	{
		Node tnode = head;
		while (tnode !=null)
		{
			System.out.print(tnode.data + * * );
			tnode = tnode.next;
		}
		
	}
	public static void main(string[]args)
	{
		LinkedList<E> llist = new LinkedList();
		llist.append(66);
		llist.push(77);
		llist.push(11);
		llist.append(44);
		llist.insertAfter(llist.head.next,88);
		System.out.println("Created Linked list is: *);"
		llist.printList();
	}
}