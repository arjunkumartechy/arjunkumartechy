package BasicConceptsAndQuestions;

import java.util.Scanner;

public class BasicPatternsProblems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no.of rows : ");
        int rows  = in.nextInt() ;
        /*  rows = 4 ;
        * * * *
        * * * *
        * * * *
        * * * *
        * */

        for(int i = 1 ; i <= rows ; i++ ){
            for(int j = 1 ; j <= rows ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        /* rows = 4 ;
        *
        * *
        * * *
        * * * *
        * */
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
//        Reversed of above .
        for(int i = rows ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        /*  rows = 4 ;
        * 1
        * 1 2
        * 1 2 3
        * 1 2 3 4
        * */
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*  rows = 4 ;
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * */
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        /* rows = 4 ;
             *
            ***
           *****
          *******
         */
        for(int i = 1 ; i <= rows; i++){
            for(int j = 1; j<= rows - i ; j++) {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
//        Reversed of above .
        for(int i = rows ; i >= 1; i--){
            for(int j = 1; j<= rows - i ; j++) {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
//        for rows = 4
//            *
//           ***
//          *****
//         *******
//        *********
//        *********
//         *******
//          *****
//           ***
//            *
        for(int i = 1 ; i <= rows; i++){
            for(int j = 1; j<= rows - i ; j++) {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
//        Reversed of above .
        for(int i = rows ; i >= 1; i--){
            for(int j = 1; j<= rows - i ; j++) {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
//        for rows  = 4 ; IF :(i+j) odd ==> 0 else 1  .
//        1
//        1 0
//        1 0 1
//        0 1 0 1

        for(int i = 1; i <= rows ; i++){
            for(int j = 1 ; j <= i ; j++){
                if((i+j)%2!=0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
        System.out.println();

//          For rows = 5 ;
//        1        1
//        12      21
//        123    321
//        1234  4321
//        1234554321
        for(int i = 1; i<= rows; i++){
//            initial pattern .
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }
//            Spaces .
            for(int k = 1 ; k <= 2 *(rows - i) ; k++ ){
                System.out.print(" ");
            }
//            final pattern . (In reverse order to initial )
            for(int l = i ; l >= 1 ; l--){
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println();
//        For rows = 4 ;
//        A
//        A B
//        A B C
//        A B C D
//        Method 1  : (Explicit)
        for (int i = 65; i < (65+rows) ; i++) {
            for(int j = 65 ; j<= i ; j++ ){
                System.out.print((char)(j)+" ");
            }
            System.out.println();
        }
//        Method 2  : (Implicit)
        System.out.println();
        for (char i = 65; i < (65+rows) ; i++) {
            for(char j = 65 ; j<= i ; j++ ){
                System.out.print((j)+" ");
            }
            System.out.println();
        }
//        Hollow Cylinder .
        System.out.println();
        for(int i = 1 ; i<= rows ; i++){
            for(int j =1 ; j <= rows ; j++){
                if((i==1)||(j==1)||(i==rows)||(j==rows)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
//        Spiral Pattern .(Awesome Question)
        /*
        6 6 6 6 6 6 6 6 6 6 6
        6 5 5 5 5 5 5 5 5 5 6
        6 5 4 4 4 4 4 4 4 5 6
        6 5 4 3 3 3 3 3 4 5 6
        6 5 4 3 2 2 2 3 4 5 6
        6 5 4 3 2 1 2 3 4 5 6
        6 5 4 3 2 2 2 3 4 5 6
        6 5 4 3 3 3 3 3 4 5 6
        6 5 4 4 4 4 4 4 4 5 6
        6 5 5 5 5 5 5 5 5 5 6
        6 6 6 6 6 6 6 6 6 6 6

         */
        for(int i = 1;  i<= (2*rows-1) ; i++ ){
            for (int j = 1; j <= (2*rows-1) ; j++) {
                int downDist = (2*rows-1) - i ;
                int upDist = i - 1 ;
                int left = j - 1;
                int right = (2*rows-1)-j ;
                int minAns = Math.min(Math.min(downDist,upDist),Math.min(left,right)) ;
                System.out.print((rows-minAns)+" ");
            }
            System.out.println();
        }

    }
}
