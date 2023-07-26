//Implementation of Queue in LinkedList
//Implementing Queue using Java collecttion Framework
import java.util.*;
import java.util.LinkedList;
public class alpha38Queue3 {

    //Implementation of Queue in LinkedList-->

      /*  static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
       }
      static class Queue{

        static Node head = null;
        static Node tail = null;


            public static boolean isEmpty(){
               return head==null && tail==null;
            }

          
                
                //Add
                public static void add(int data){
                    Node newNode = new Node(data);
                    if(head == null){
                        head = tail = newNode;
                    }
                    tail.next = newNode;
                    tail = newNode;

                    
                }
                //remove
                public static int remove(){
                    if(isEmpty()){
                        System.out.println("Queue is empty");
                    return -1;
                    }
                    int front = head.data;
                    //single element
                    if(tail==head){
                        tail = head = null;
                    } else{
                        head = head.next;
                    }

                  
                    return front;  
                }

                //peek
                public static int peek(){
                    if(isEmpty()){
                        return -1;
                        }
                    
                    return head.data;
                }
                
            }
         */
    

    public static void main(String[] args){
       /*  Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
         while(!q.isEmpty()){
       System.out.println(q.peek());
       q.remove();
       } */
     
       //java collection framework-->

      // Queue<Integer> q = new LinkedList<>(); //Queue is an interface so cannot create object of it so LinkedList class implement Queue so we can creat obj of that 
            //OR
       Queue<Integer> q = new ArrayDeque<>();
         q.add(1);
        q.add(2);
        q.add(3);
         while(!q.isEmpty()){
       System.out.println(q.peek());
       q.remove();
       


    }      
    
}
}
