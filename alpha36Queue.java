public class alpha36Queue{

     static class Queue{

        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            
         }


            public static boolean isEmpty(){
               return rear == -1;
            }
                
                //Add element in Queue

               /*  public static void add(int data){
                    if(rear == size-1){
                        System.out.println("queue is full");
                        return;
                    }
                    rear = rear+1;
                    arr[rear] = data;
                    
                    
                } */


                //Remove element from Queue

                /* public static int remove(){
                    if(isEmpty()){
                    return -1;
                    }
                    int front = arr[0];
                    for(int i=0;i<rear;i++){
                        arr[i] = arr[i+1];

                    }
                    rear = rear-1;
                    return front;  
                } */




                //peek element from Queue

                /* public static int peek(){
                    if(isEmpty()){
                        return -1;
                        }
                    
                    return arr[0];
                } */
                
            }
        
    

    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
         while(!q.isEmpty()){
       System.out.println(q.peek());
       q.remove();
       }
}   
}


    
    
