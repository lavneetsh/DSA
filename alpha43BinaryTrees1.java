import java.util.*;
import java.util.LinkedList;
public class alpha43BinaryTrees1 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left =null;
            this.right =null;
        }
    }
   
        //Tree formation

    /* static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            } else{
               Node newNode = new Node(nodes[idx]);
               newNode.left = buildTree(nodes);  
               newNode.right = buildTree(nodes);  
               return newNode;
            }} */




            
       // PREORDER traversal of Binary Tree

           /*  public static void preorder(Node root){  //o(n)
            if(root == null){
                System.out.print(-1+" ");
                return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            } */





       // INORDER Traversal of Binary Tree 

            /* public static void inorder(Node root){
                if(root == null){
                System.out.print(-1+" ");
                return ;
                }
                inorder(root.left);
                System.out.print(root.data+" ");
                inorder(root.right);
               }
 */






      //POSTORDER traversal of Binary Tree

           /*  public static void postorder(Node root){
               if(root == null){
                System.out.print(-1+" ");
                return ;
                }
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data+" ");
               } */





       //Level order Traversal

        /* public static void levelOrder(Node root){
                if(root == null ){
                    return;
                }
                Queue<Node> q = new LinkedList<>(); 
                q.add(root);
                q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                } else{
                    System.out.print(currNode.data+" ");

                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }

            }
               } */


    

    public static void main(String[] args) {
        
       /*  int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; (preorder)
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data); */
    
       
         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);

        //preOrder Traversal
        //tree.preorder(root); 

        //Inorder Traveral
        //tree.inorder(root);

        //postorde traversal
        //tree.postorder(root);

        //Levelorder Traversal
        tree.levelOrder(root);

    }
    
}

