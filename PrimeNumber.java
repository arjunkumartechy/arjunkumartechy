package BasicConceptsAndQuestions;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Input a number : ");
        int number = in.nextInt() ;
        System.out.println(checkPrime(number));


    }
    static boolean checkPrime(int num) {
        if(num<=1) return false;
        int d = 2 ;
        while (d*d <= num ) {
            if(num%d==0){
                return false;
            }
            d++;
        }
        return true;
    }
}
