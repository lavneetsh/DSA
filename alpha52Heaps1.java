import java.util.ArrayList;

public class alpha52Heaps1 {


    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){  //O(logn)
            //add at last idx
            arr.add(data);
            int x = arr.size()-1; // x is child idx
            int par = ((x-1)/2);  // par is parent index
            
            while(arr.get(x) < arr.get(par)){  //O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par, temp);

                x = par;
                par =(x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

         private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left) ){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            if(minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }

        }


        public int remove(){
            int data = arr.get(0);

            //step1- swap first & last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step2- delete last
            arr.remove(arr.size()-1);

            //step3 - heapify
            heapify(0);
            return data;

        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }



    
    //Heap Sort

    public static void heapify(int arr[],int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx =i;

        if(left < size && arr[left]> arr[maxIdx]) {
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != i){
            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }
  /// HEAP SORT

    public static void heapSort(int arr[]){
        //step1 - build maxHeap
        int n = arr.length;
        for(int i=n/2; i>=0;i--){
            heapify(arr,i,n);
        }

        //step2- puush largest at end
        for(int i=n-1;i>0;i--){
            //swap(largest-first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }
    


    public static void main(String[] args) {
       /*  Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(h.peek());
        pq.remove();
        } */
        //here we can see that Priority Queue id=s Implemented in form of heap datastructure

        int arr[] = {1,2,4,5,3};
        heapSort(arr);

        //peint
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    
}
