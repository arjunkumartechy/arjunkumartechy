package BasicConceptsAndQuestions;

import java.util.Scanner;

public class CharacterCaseCheck {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a character :=> ");
            char ch = in.next().trim().charAt(0);

            if(ch>='a' && ch<='z'){
                System.out.println("Lowercase");
            }
            if(ch>='A' && ch<='Z'){
                System.out.println("UpperCase");
            }
            int[] array = {2,3,5};
            for(int ele : array){
                System.out.println(ele);
            }


    }
}
