package BasicConceptsAndQuestions;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       while (true){
           System.out.println("input a operator : ");
           char op = in.next().trim().charAt(0);
           if(op=='x' || op=='X'){
               System.out.println("Program Terminated . ");
               break;
           }
           int num1,num2;
           System.out.println("Input first number : ");
           num1 = in.nextInt();
           System.out.println("Input Second number : ");
           num2 = in.nextInt();

           switch (op){
               case '-':
                   System.out.println(num1 +" - "+num2 +" = "+(num1-num2));
                   break;
               case '+':
                   System.out.println(num1 +" - "+num2 +" = "+(num1+num2));
                   break;
               case '*':
                   System.out.println(num1 +" * "+num2 +" = "+(num2*num1));
                   break;
               case '/':
                   if(num2==0){
                       System.out.println("Division by zero !");
                       break;
                   }
                   System.out.println(num1 +" / "+num2 +" = "+(num1/num2));
                   break;
               case '%':
                   if(num2==0){
                       System.out.println("Division by zero !");
                       break;
                   }
                   System.out.println(num1 +" % "+num2 +" = "+(num1%num2));
                   break;
               default:
                   System.out.println("Operator not found try again . ");
           }
       }
    }
}
