package BasicConceptsAndQuestions;

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {  // Execution starts from here .
//        Lecture #01
        Scanner sc = new Scanner(System.in);
//        javac BasicConceptsAndQuestions.Conditionals.java(Java compiler compiles it and creates .class file (byte code) ).
//        java FileName
//       Primitives (that can't be broken into further parts) .
//        int rollNo = 12  ;
//        String name = "Arjun"; // non-primitive .
//        char ch = 'A' ;
//        float marks = 98.5f;
//        double largeDecimalNumbers = 34342.4353;
//        long largeIntegerValue = 23545456L ;
//        boolean check = true ;
//
//        System.out.println("Enter a sentence  . ");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);
//
//        int price = 234_000_000 ;
//        System.out.println(price);
//
//        System.out.println("Enter marks2 Here ; ");
//        float marks2 = sc.nextFloat() ;
//        System.out.println(marks2);
//
////        Casting and Typecasting .
//
//        int num = (int) (56.78) ;
//        System.out.println(num);
////        Automatic type conversion in expression
//        int a = 257 ;
//        byte b = (byte) (a) ; // 257 % 256 = 1
//        System.out.println(b);
//
//        byte x = 40 ;
//        byte y = 50 ;
//        byte z = 100 ;
//        int ans = x  * y / z ; // (is performed using integers not byte )
//
//        int number = 'A' ; // automatic type conversion
//        System.out.println(number); // 65 (Ascii Value)
        System.out.println("नमस्ते"); // Unicode .
        System.out.println("众善之"); // Hello everyone .

        System.out.println("Please enter temperature in C : ");
        float tempC = sc.nextFloat();

        float tempF = (tempC * 9 / 5 ) + 32 ;
        System.out.println(tempF);



    }
}
