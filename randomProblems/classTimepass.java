import java.util.*;
public class classTimepass {
    
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

    static class BinaryTree{
        static int index=-1;

        public static Node buildTree(int node[]){
            index++;
            if(node[index]==-1)
                return null;
            
            Node newNode = new Node(node[index]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }
    }

    static void preorder(Node root){
        if(root==null)
            return;
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root){
        if(root==null)
            return;
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void postorder(Node root){
        if(root==null)
            return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    static void levelorder(Node root){
        
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode==null){
                System.out.println();
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }
        }

    }
    public static void main(String []args){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);

        preorder(root);
        System.out.println();

        inorder(root);
        System.out.println();

        postorder(root);
        System.out.println();

        levelorder(root);
    }
}
