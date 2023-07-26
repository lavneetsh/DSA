
 class LinkedList {



   //create NODE class
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //create head & tail Node

    public static Node head;
    public static Node tail;
    public static int size;

      //OPERATIONS-------------->

       //Add First--->

   /*  public void addFirst(int data){

        //step-1: create new Node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step-2:
        newNode.next = head; //link 
        //step-3: head = newNode
        head = newNode;
    } */


       //Add Last--->

       /* public void addLast(int data){

        Node newNode = new Node(data);
        size++;
        if(head==null){
           head = tail = newNode;
           return;
        }
        tail.next = newNode;
        tail = newNode;
       } */

   
   
       //method to print linkedlist--->

      /*  public void print(){  //O(N)

         //if(head==null){
         //System.out.print("LL is Empty");
        //} 

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
       } */





       //ADD in The Middle--->
      
       /* public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;

        //find previous node
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
         //operation to link newNode

         newNode.next = temp.next;
         temp.next=newNode;

       } */





     //Remove first-->

       /* public int removeFirst(){
        if(size==0){
            System.out.println("LL IS Empty");
            return Integer.MIN_VALUE;  //or can use -1
        }
        else if(size==1){
            int val = head.data;
            head =tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
       } */




    //RemoveLast--->

  /*  public int removeLast(){
    if(size ==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }

    //prev: i = size-2
    Node prev = head;
    for(int i=0;i<size-2;i++){
        prev = prev.next;
    }

    int val = prev.next.data;  //tail.data
    prev.next = null;
    tail = prev;
     size--;
     
     return val;
  } 
*/






// Search In a LinkedList using iteration --->

 /*  public int iterSearch(int key){  //O(n)
    int i=0;
    Node temp = head;

    while(temp!=null){
     if(temp.data==key){
        return i;
     }else{
        temp= temp.next;
        i++;
     }
}
//key not found
   return -1;
} */





// Search in LinkedList using Recursion

/* public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;

    }
    int idx = helper(head.next.key){
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

}
//Search using Recursion
public int recSearch(int key){
    return helper(head,key);
}
 */


    


// Reverse a LinkedList (Iterative approach)        (H.W - RECURSIVE APPROACH )

/* public void reverse(){
    Node prev = null;
    Node curr = tail =  head;
    Node next;

    while(curr!= null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

    }
    head = prev;
} */





//Remove Nth Node from End

/* public void deletefromEnd(int n){
    //calculate size
    int siz = 0;
    Node temp = head;
    while(temp!=null){
        temp = temp.next;
        siz++;
    }

    if(n==siz){
        head = head.next;  //removeFirst
        return;
    }
    //siz-n
    int i=1;
    int inxToRemove = siz-n;
    Node prev = head;
    while(i < inxToRemove){
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return;
} */
  





// Check If LinkedList is Palindrome-->
 //To Find Mid of LinkedList- (slow-fast approach)
public Node findMid(Node head){
    Node slow = head;
    Node fast = head;
   
    while(fast!=null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow; //slow is my mid
}

  public boolean checkPalindrome(){
    if(head == null || head.next == null){
        return true;
    }
    //step - find mid
    Node midNode = findMid(head);

    //step2- reverse 2nd Half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node right =prev;
    Node left= head;
    
    //step3- compare left and right half
    while(right!=null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
  }
//]]]

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       // ll.head = new Node(1);
       // ll.head.next = new Node(2);
       //ll.print();

       ll.addFirst(2);
       //ll.print();

       ll.addFirst(1);
       //ll.print();

       ll.addLast(4);
       //.print();

       ll.addLast(5);
      // ll.print();

       ll.add(2, 3);
       ll.print();


       /* System.out.println(ll.size);
       System.out.println("after removeFirst-1");
       ll.removeFirst();
       ll.print();
       System.out.println(ll.size);
      System.out.println("after removeLast-1");
       ll.removeLast();
       ll.print();
       System.out.println(ll.size); */

      //Iterative Search in LinkeList
      /* System.out.println(ll.iterSearch(5));
      System.out.println(ll.iterSearch(10));
      */

      //Recursive Search
     /*  System.out.println(ll.iterSearch(5));
      System.out.println(ll.iterSearch(10)); */


      //Reverse likedlist
       /* ll.reverse();
       ll.print(); */


       //remove Nth element from end
       ll.deletefromEnd(2);
       ll.print();

       
       
       /* ll.addLast(1);
       ll.addLast(2);
       ll.addLast(2);
       ll.addLast(1);
        ll.print();  //1->2->2->1

        System.out.println(ll.checkPalindrome()); */
    }
    
}
