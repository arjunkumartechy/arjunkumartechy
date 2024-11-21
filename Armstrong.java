package BasicConceptsAndQuestions;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number : ");
        long num = in.nextLong() ;
        System.out.println(checkArmstrong(num));

//        BasicConceptsAndQuestions.Armstrong number in the given range .
        System.out.println("Start Value : ");
        long start = in.nextLong();
        System.out.println("Last Value : ");
        long last = in.nextLong();
        armstrongInAGivenRange(start,last);
    }
    static boolean checkArmstrong(long n) {
        long noOfDigits = (long) ( Math.log10(n) + 1);
        long temp = n ;

        long newNumber = 0 ;
        while(n>0){
            long prod = 1 ;
            for(long i = 1; i <= noOfDigits ; i++){
                prod *= (n%10) ;
            }
            newNumber += prod;
            n /= 10 ;
        }
        return (newNumber==temp) ;
    }
    static void armstrongInAGivenRange(long start, long end ) {
        if(start > end) {
            System.out.println("Invalid Range . ");
            return;
        }
        for(long i = start ; i <= end; i++){
            if(checkArmstrong(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
