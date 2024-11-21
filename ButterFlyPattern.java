package BasicConceptsAndQuestions;

import java.util.Scanner;

public class ButterFlyPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input No.of rows to print Butterfly Pattern . ");
        int rows = in.nextInt();
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= i; j++ ){
                System.out.print("*");
            }
            for(int k = 1 ; k <= (rows - i)*2 ; k++ ){
                System.out.print(" ");
            }
            for(int l = 1 ; l <= i ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = rows-1 ; i >= 1 ; i--){
            for(int j = 1 ; j <= i; j++ ){
                System.out.print("*");
            }
            for(int k = 1 ; k <= (rows - i)*2 ; k++ ){
                System.out.print(" ");
            }
            for(int l = 1 ; l <= i ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hi 1st pattern is done .");
    }
}
