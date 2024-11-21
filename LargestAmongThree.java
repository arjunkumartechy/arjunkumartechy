package BasicConceptsAndQuestions;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Three Numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int largest = a ;
        if(largest < b ) {
            largest = b ;
        }
        if(largest < c ) {
            largest = c ;
        }
        System.out.println(largest);
        int ans = Math.max(Math.max(a,b),c);
        System.out.println(ans);

    }
}
