package BasicConceptsAndQuestions;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt() ;
        System.out.println("Enter Digit to search in : ");
        int target = in.nextInt();
        int ans = occurrences(n,target);
        System.out.println(ans);
    }
    static int occurrences(int num,int target ) {
        int counter = 0 ;
        while(num>0){
            if((num%10)==target){
                counter++;
            }
            num /= 10 ;
        }
        return counter;
    }
}
