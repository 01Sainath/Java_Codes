import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumOfKthLevel {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			left = right = null;
		}
	}
	
	static class BinaryTree{
		static int index=-1;
		public Node buildTreePreorder(ArrayList<Integer> nodes) {
			index++;
			if(nodes.get(index)==-1) {
				return null;
			}
			
			Node newNode = new Node(nodes.get(index));
			newNode.left = buildTreePreorder(nodes);
			newNode.right = buildTreePreorder(nodes);
			
			return newNode;
		}
	}
	
	private static int sumOfLevel(int level, Node root) {
		
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		int currLevel=0;
		int levelSum=0;
		while(!q.isEmpty()) {
			Node currNode =  q.remove();
			
			if(currNode == null) {
				currLevel++;
				if(q.isEmpty()) {
					break;
				}
				q.add(null);
			}
			else {
				if(currLevel == level) {
					levelSum+=currNode.data;
				}
				if(currNode.left!=null) {
					q.add(currNode.left);
				}
				if(currNode.right!=null) {
					q.add(currNode.right);
				}
			}
		}
		
		return levelSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int k = input.nextInt();
		String str = input.next();
		
		ArrayList <Integer> nodes = new ArrayList<>();
		
		listOfPreorder(str,nodes);
		
//		for(int ele:nodes) {
//			System.out.print(ele+" ");
//		}
		
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTreePreorder(nodes);
		
		System.out.println(sumOfLevel(k,root));
	}
	
	private static void listOfPreorder(String str,ArrayList<Integer> nodes) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') {
				if(str.charAt(i+1)==')') {
					nodes.add(-1);
				}
			}
			else if(str.charAt(i)==')') {
				continue;
			}
			else {
				nodes.add(((int)str.charAt(i))-48);
			}
		}
	}

}
