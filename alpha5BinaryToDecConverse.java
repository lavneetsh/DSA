//Binary to deciml conversion
public class alpha5BinaryToDecConverse {

    public static void binTODec(int binNum){
        int binNumber = binNum;
        int pow = 0;
        int decimaln =0;
        
        
        while(binNum>0){
            int lastdig = binNum%10;
            decimaln  = decimaln+ lastdig*(int)Math.pow(2,pow );
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + binNumber+" is: "+decimaln);
    }
    public static void main(String[] args) {
        binTODec(101);
        
    }
    

    //DEcimal to binary
  /*   public static void decToBin(int n){
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem*(int)Math.pow(10,pow)) ;
            pow++;
            n = n/2;
        }
        System.out.print("binary nimber is : "+binNum );
    }

    public static void main(String[] args) {
        decToBin(5);

        
    } */
}
