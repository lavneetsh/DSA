import java.util.ArrayList;

public class alpha48BST3 {

    static class Node {

        int data;
        Node left; // by default null
        Node right; // by default null

        Node(int data) {
            this.data = data;

        }
    }

    ////// create mirror of BST/////

    /* 
      public static Node createMirror(Node root){
      if(root == null){
      return null;
      }
      Node leftMirror = createMirror(root.left);
      Node rightMirror = createMirror(root.right);
      
      root.left = rightMirror;
      root.right = leftMirror;
      return root;
      }
     /

    //// sorted array to BST/////

    /
      public static Node createBST(int arr[],int st, int end){
      if(st>end){
      return null;
      }
      
      int mid = (st+end)/2;
      Node root = new Node(arr[mid]);
      root.left = createBST(arr,st,mid-1);
      root.right = createBST(arr, mid+1, end);
      return root;
      }
      
      public static void preorder(Node root){
      if(root == null){
      return;
      }
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);
      }
     /

    /
      public static void inorder(Node root){
      if(root == null){
      return;
      }
      preorder(root.left);
      System.out.print(root.data+" ");
      preorder(root.right);
      }
     /

    // Convert BST to Balanced BST-->
    /
      public static void getInorder(Node root, ArrayList<Integer> inorder){
      if(root == null){
      return;
      }
      
      getInorder(root.left, inorder);
      inorder.add(root.data);
      getInorder(root.right, inorder);
      }
      
      
      
      
      public static Node balanceBST(Node root){
      //inorder sequence
      
      ArrayList<Integer> inorder = new ArrayList<>();
      getInorder(root, inorder);
      
      
      //step2- sorted inorder to balance BST
      root = createBST(inorder, 0, inorder.size()-1);
      return root;
      }
      
      public static Node createBST(ArrayList<Integer> inorder,int st, int end){
      
      if(st>end){
      return null;
      }
      
      int mid = (st+end)/2;
      Node root = new Node(inorder.get(mid));
      root.left = createBST(inorder,st,mid-1);
      root.right = createBST(inorder, mid+1, end);
      return root;
      }
     */

    static class Info {

        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }

    }


        public static int maxBST = 0;
     public static Info largestBST(Node root){

        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
       Info leftInfo =  largestBST(root.left);
       Info rightInfo =  largestBST(root.right);
       int size = leftInfo.size + rightInfo.size + 1;
       int min = Math.min(root.data, Math.min(leftInfo.size, rightInfo.size));
       int max = Math.max(root.data, Math.max(leftInfo.size, rightInfo.size));
         
       if(root.data <= leftInfo.max  || root.data >= rightInfo.min){
        return new Info(false,size, min , max);
       }

       if(leftInfo.isBST && rightInfo.isBST){
           maxBST = Math.max(maxBST, size);
             return new Info(true,size,max,min); 
       }


       return new Info(false, size, min, max);

     }









    public static void main(String[] args) {

        //////////////// problem-4-mirror of BST /////////////////////////
        /* 
          
                   8
                  / \
                 5  10
                / \   \
                3 6   11
          
         */

        
          Node root = new Node(8);
          root.left = new Node(5);
          root.right = new Node(10);
          root.left.left = new Node(3);
          root.left.right = new Node(6);
          root.right.right = new Node(11);
         

        /* 
                     8
                   /  \
                  10   5
                 /    / \
                11    6  3
          
          Mirror Bst
         */

        
          root = createMirror(root);
          preorder(root);
         

        ////////////// //problem-5 - Sorted Array to BST-/////////////->

        // int arr[] = {3,5,6,8,10,11,12};

        /* 
          
                     8
                    / \
                   5   11
                 / \   / \
                3  6   10 12
          
          expected BST
          
         */

        
          Node root = createBST(arr, 0, arr.length-1);
          preorder(root);
         

        /////////// problem-6-Convert BST to Balanced BST //////////-->
        
        /* 
          8
          / \
          6 10
          / \
          5 11
          / \
          3 12
          given Bst
          
         */

        
          Node root = new Node(8);
          root.left = new Node(6);
          root.left.left = new Node(5);
          root.left.left.left = new Node(3);
          root.right = new Node(10);
          root.right.right = new Node(11);
          root.right.right.right = new Node(12);
          
          root = balanceBST(root);
          preorder(root);
         

        //////////// problrm-7-Size of Largest BST in Binary Tree////////////

        /* 
          
            50
          /    \
          30    60
          / \    / \
          5  20  45 70
          / \
          65 80
          
          given Bst
          
         */

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        
          
          
          /* 
                 60
                / \
               45 70
              / \
             65 80
          
          expected BST: SIZE=5
         */

         Info info = largestBST(root);
         System.out.println("largest BST size = "+ maxBST); 


         


    }

}
