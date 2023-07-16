import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class buildATreePreorder {
	
	static ArrayList<Integer> left = new ArrayList<>();
	static ArrayList <Integer> right = new ArrayList<>(); 
	static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class binaryTree {
		static int index = -1;
		
		public static Node buildTree(int nodes[]) {
			index++;
			if(nodes[index]==-1) {
				return null;
			}
			
			Node newNode = new Node(nodes[index]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
	}
	
	public static void preorder(Node root) {
		
		if(root == null) {
//			System.out.print(-1+" ");
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		                 
	}
	
	public static void postorder(Node root) {
		if(root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
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
					left.add(currNode.data);
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
		
		System.out.println(left);
	}
	
	private static void rightView(Node root) {
		
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			
			if(currNode==null) {
				if(q.isEmpty()) {
					break;
				}
				q.add(null);
			}
			else {
				if(q.peek()==null) {
					right.add(currNode.data);
				}
				if(currNode.left!=null) {
					q.add(currNode.left);
				}
				if(currNode.right!=null) {
					q.add(currNode.right);
				}
			}
		}
	}
	
	public static void levelOrder(Node root) {
		
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(currNode.data+" ");
				
				if(currNode.left != null) {
					q.add(currNode.left);
				}
				if(currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}
	
	public static int countOfNodes(Node root) {
		
		if(root == null) {
			return 0;
		}
		int left = countOfNodes(root.left);
		int right = countOfNodes(root.right);
		
		return left + right + 1;
	}
	
	public static int sumOfNodes(Node root) {
		
		if(root == null) {
			return 0;
		}
		int left = sumOfNodes(root.left);
		int right = sumOfNodes(root.right);
		
		return left+right+root.data;
	}
	
	public static int height(Node root) {
		
		if(root == null) {
			return 0;
		}
		int left = height(root.left);
		int right = height(root.right);
		
		int myHeight = Math.max(left, right)+1;
		
		return myHeight;
	}

	public static int diameter(Node root) {
		
		if(root == null){
			return 0;
		}
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = height(root.left) + height(root.right) + 1;

		return Math.max(diam3 , Math.max(diam1,diam2));
	}

	static class treeInfo {
		int ht;
		int diam;

		treeInfo(int ht, int diam) {
			 this.ht=ht;
			 this.diam=diam;
		}
	} 

	public static treeInfo diameter2(Node root){

		if(root == null){
			return new treeInfo(0,0);
		}
		treeInfo left = diameter2(root.left);
		treeInfo right = diameter2(root.right);

		int myHeight = Math.max(left.ht ,right.ht) + 1;

		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1;

		int myDiam = Math.max(Math.max(diam1,diam2),diam3);

		treeInfo myInfo = new treeInfo(myHeight , myDiam);

		return myInfo;
	} 

	public static int sumOfALevel(Node root, int level){

		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		int counter = 1;
		int sum =0;
		while(counter<=level){
			Node currNode = q.remove();

			if(currNode == null){
				counter++;
				if(q.isEmpty())
					break;
				else
					q.add(null);
			}
			else{
				if(currNode.left != null){
					q.add(currNode.left);
				}
				if(currNode.right != null){
					q.add(currNode.right);
				}
			}

			if(counter == level && currNode!=null){
				sum+=currNode.data;
			}
		}

		return sum;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,-1}; 
		binaryTree tree = new binaryTree();
		Node root = tree.buildTree(nodes);
		
//		System.out.println(diameter2(root).diam);
//
		levelOrder(root);
//		
//		preorder(root);
//		System.out.println();
//		
//		inorder(root);
//		System.out.println();
//		
//		postorder(root);
//		System.out.println();
//		System.out.println();

		System.out.println(sumOfALevel(root,2));
		
		leftView(root);
		rightView(root);
		System.out.println(right);

	}

}
