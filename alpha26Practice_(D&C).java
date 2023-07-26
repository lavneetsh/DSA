//practice divide and conqure

 class alpha26 {

static int d= 0;

//Merge sort
/* 
    public static void mergeSort(int arr[],int si,int ei){
      

        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1,ei);

        merge(arr,si,mid,ei);

    }
      
     public static void merge(int arr[],int si,int mid,int ei){
        d++;
        System.out.println("for "+d+" time is : "+si+","+mid+","+ei);
        int temp[] = new int[ei-si+1];
        int i = si;
        System.out.println("i for the "+d+" time : "+i );
        int j = mid+1;
         System.out.println("jfor the "+d+" time : "+j );
        int k =0;


        while(i<=j && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
            while(i<=mid){
                temp[k++] = arr[i++];
            }
            while(j<=ei){
                temp[k++] = arr[j++];
            }

        
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    } */


    //QUICK SORT
    
   /*  public static void quickSort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int pivot = arr[ei];
        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr,pidx+1,ei);

    }

    public static int partition(int arr[],int si,int ei){

        int pivot = arr[ei];
        
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                
               i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }  
            
        }
        i++;  
        int temp = pivot;
           arr[ei] = arr[i];
           arr[i] = temp;

           return i;
        
        
    } */
     



  

    
















    
    public static void main(String[] args) {
         int arr[] = {6,3,9,5,2,8};
     /*  mergeSort(arr,0,arr.length-1);
      for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }  */


     /*  quickSort(arr, 0, arr.length-1);
       for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }  */
      
        /* int arr[] = {4,5,6,7,0,1,2};
      int target =0;
      int taridx = search(arr, target,0,arr.length-1);
      System.out.println(taridx); */
      twoSum(arr, 7);
        
    }
    
}
