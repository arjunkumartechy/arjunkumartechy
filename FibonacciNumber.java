package BasicConceptsAndQuestions;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Input a number :=> ");
        int idx = in.nextInt() ;
        System.out.println(checkFib(idx));

    }
    static int checkFib(int idx) {
        if(idx<=1) return idx ;
        int a = 0 , b = 1 ,c = a + b ;
        for(int i = 2 ; i <= idx ; i++){
            c = a + b ;
            a = b ;
            b = c ;
        }
        return c;
    }
}
