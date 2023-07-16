import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leftViewOfBT {
	
	static ArrayList <Integer> list = new ArrayList<>();
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	public static void leftView(Node root) {
		
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		int counter=1;
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			
			if(currNode == null) {
				counter=1;
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				if(counter==1) {
					list.add(currNode.data);
				}
				counter++;
//				System.out.print(currNode.data+" ");
				
				if(currNode.left != null) {
					q.add(currNode.left);
				}
				if(currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.left.right = new Node(7);
		
		leftView(root);
		
		System.out.println(list);
		
	}

}
