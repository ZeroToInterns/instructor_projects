
public class BinaryTree {

	private Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	//inserts a new node into the BST
	public void insert(int newData){
		Node newNode = new Node(newData);
		
	}
	
	//prints the inorder traversal of the BST
	public void printInOrder(){
		
	}
	
	//prints the inorder traversal of the BST
	public void printPreOrder(){
		
	}
	
	//prints the inorder traversal of the BST
	public void printPostOrder(){
		
	}
}
