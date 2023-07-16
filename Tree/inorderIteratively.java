import java.util.Stack;

public class inorderIteratively {

	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=null;
			right=null;
		}
	}
	
	static class BinaryTree{
		Node root;
		
		void inorder(Node root) {
			if(root==null) {
				return;
			}
			
			Node curr = root;
			Stack<Node> s = new Stack<>();
			
			while(curr!=null || s.size()>0) {
				
				while(curr!=null) {
					s.push(curr);
					curr=curr.left;
				}
				
				curr=s.pop();
				
				System.out.print(curr.data+" ");
				curr=curr.right;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
		
		tree.root= new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.inorder(tree.root);
	}

}
