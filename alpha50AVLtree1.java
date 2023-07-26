
//AVL TREes

public class alpha50AVLtree1 {


    static class Node{

        int data;
        int height;
        Node left;       //by default null
        Node right;  //by default null

        Node(int data){
            this.data = data;
            height = 1;
            
    }


    public static Node root;

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left)- height(root.right);
    }

    //Left Rotate

    public static Node leftRotete(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //Update heights
        x.height = Integer.max(height(x.left), height(x.right))+1;
        y.height = Integer.max(height(y.left), height(y.right))+1;

        //Return new root
        return y;
    }

     //Get balance factor of node
    public static int getBalance(Node root){
        if(root == null)
        return 0;

        return height(root.left)- height(root.right);
    }
    public static Node insert(Node root , int key){
        if(root == null)
        return new Node(key);

        if(key < root.data){

            root.left = insert(root.left, key);
        }
          else if(key > root.data){
          root.right = insert(root.right, key);
          }
          else return root;   //Duplicate keys are not allowed

         //Update root height
         root.height  = 1 + Math.max(height(root.left), height(root.right));

         //Get root's balance factor
         int bf = getBalance(root);

         //Left Left case
         if(bf < -1  && key > root.right.data){
            root.right = leftRotate(root.right);
             return rightRotate(root);
         }
         //Left Right case
         if(bf > 1  && key > root.left.data){
            root.right = leftRotate(root.left);
             return rightRotate(root);
         }
         //Right Left case
         if(bf < -1  && key > root.right.data){
            root.right = right.Rotate(root.right);
             return leftRotate(root);
         }
         return root;  // returned if AVL balanced

          
        }

}




    public static void main(String[] args) {
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);

        /*
                    30
                   /  \
                  20   40 
                 / \    \
                10  25  50
          */

          preorder(root);
        
    }
    
}
