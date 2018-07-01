
public class LinkedList {

	Node head;
	Node end;

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node newNode = list.new Node(5);
		Node newNode2 = list.new Node(6);
		Node newNode3 = list.new Node(8);
		
		list.add(newNode);
		list.add(newNode2);
		list.add(newNode3);
		
		
		Node newNode4 = list.new Node(7);
		list.insert(newNode4, 3);
		list.printList();
		
	}
	
	public LinkedList(){
		this.head = null;
		this.end = null;
	}
	
	public class Node{
		int data;
		Node next;
		
		//constructor for Node
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
//	Add (adds an element to the end of the linked list)
	public void add(Node newNode){
		//linked list is empty
		if(this.head == null){
			this.head = newNode;
			this.end = newNode;
		}
		//linked list is not empty
		else{
			this.end.next = newNode;
			this.end = newNode;
		}
	}
	
//	Insert (inserts an element anywhere in the linked list)
	public void insert(Node newNode, int index){
		//linked list is empty
		if(this.head == null && index == 0){
			this.head = newNode;
			this.end = newNode;
		}
		//index is invalid
		else if(index > this.getSize() || index < 0){
			throw new IndexOutOfBoundsException();
		}
		else if(index == this.getSize()){
			this.add(newNode);
		}
		//linked list is not empty and index to insert is valid
		else{
			Node temp = head;
			for(int i = 0; i < index-1; i++){
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}     
		// 5 ---> 6 ---> 7---> 8 ---> null
	}
	
//	Delete (Deletes any element from the linked list)
	public void deleteNode(Node node){
		if(head.data == node.data){
			head = head.next;
		}
		Node temp = head;
		while(temp.next.data != node.data){
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
//	getSize returns the number of nodes in the list
	public int getSize(){
		Node temp = head;
		int count = 0;
		
		while(temp != null){
			temp = temp.next;
			count++;
		}
		return count;
	}

	
	public void printList(){
		Node temp = this.head;
		for(int i = 0; i < this.getSize(); i++){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
