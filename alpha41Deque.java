import java.util.*;
import java.util.LinkedList;

//DEQUE
//Stack & Queue using Deque
public class alpha41Deque {

    //Implementing Stack & Queue using Deque


    //stack
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
          return  deque.removeLast();
        }

        public int peek(){
          return deque.getLast();
        }
    }

  //Queue
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();
            
            
            public void add(int data){
                deque.addLast(data);
            }
            public int remove(){
           return  deque.removeFirst();
        }
            public int peek(){
            return deque.getFirst();
        }

        }
    


    public static void main(String[] args) {
        //DEQUE
      /*   Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2);  //2 1
        deque.addLast(3);
        deque.addLast(4);// 2 1 3 4
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);

        System.out.println("first element : "+deque.getFirst());
        System.out.println("Last element : "+deque.getLast()); */


        /* Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop()); */

    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
    }
    
}
