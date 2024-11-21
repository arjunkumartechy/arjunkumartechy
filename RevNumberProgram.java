package BasicConceptsAndQuestions;

import java.util.Scanner;

public class RevNumberProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number => ");
        int num = in.nextInt();
        System.out.println("Original Number => "+num);
        System.out.println("Reversed Number => " + revNumber(num));
        int noOfDigits = ((int)(Math.log10(num))+1);
        System.out.println(noOfDigits);



    }
    static int revNumber(int n){
        boolean isNeg = (n<0);
       if(isNeg){
           n = -n ;
       }
       int ans = 0 ;
       while(n>0){
           int rem = n % 10 ;
           ans = rem+( ans * 10 ) ;
           n /= 10 ;
       }
       if(isNeg){
           return -ans;
       }else{
           return ans;
       }
    }
}
