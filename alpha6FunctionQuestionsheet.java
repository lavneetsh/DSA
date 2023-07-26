//function questionshhet

public class alpha6FunctionQuestionsheet {
    // 1
    /* 
      public static double Avg(int a,int b,int c){
      double average = (a+b+c)/3;
      System.out.println(average);
      return average;
      
      }
     */



    // 2

    /* 
      public static void isEven(int n){
      boolean val = true;
      if(n%2==0){
      System.out.println(val);
      
      }
      else{
      System.out.println(false);
      }
      
      }
     */



    // 3

    /* 
      public static void isPalindrome(int n){
      int pal = n;
      int p = 2;
      int palrev =0;
      int dig =0;
      
      while(n>0){
      dig = n%10;
      palrev = palrev + dig*(int)Math.pow(10,p);
      p--;
      n = n/10;
      }
      System.out.println("succesful tll here and the revnum is"+ palrev);
      if(pal == palrev){
      System.out.println("given number is palindrome ");
      }
      else{
      System.out.println("Not a Palindrome");
      }
      }
    */



    
    // 4

    public static int computeDigitSum(int number) {
        int sum = 0;

        // Convert the number to a positive value
        number = Math.abs(number);

        while (number > 0) {
            // Get the rightmost digit
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the rightmost digit
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Avg(2, 4, 6);
        // isEven(10);
        // isPalindrome(122);
        System.out.println(Math.min(55, 45));
        System.out.println(Math.sqrt(121));
        System.out.println(Math.abs(-121)); // cnvrt val to positive
        System.out.println(computeDigitSum(1234));

    }

}
