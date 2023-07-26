import java.util.ArrayList;

public class alpha34Stack1 {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
       

    static class Stack{

        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }


         //push element in a Stack

         /*  public static void push(int data){
            Node newNode = new Node(data);
            
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        } */

            

        //Pop element from a Stack

        /* public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head= head.next;
            return top;    
        } */




        //peek element from stack

       /*  public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;  
        } */

    
    


    //ArrayList implementation of Statck

     /*  static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        
        //push operation

        public static void push(int data){
            list.add(data);
        }

        //pop operation
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }
        
        //peek operation
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1); 
            return top;
        }
        
    }   
    */
        

    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }


    }   
    }
    

